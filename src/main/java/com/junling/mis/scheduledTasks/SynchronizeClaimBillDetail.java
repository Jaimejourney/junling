package com.junling.mis.scheduledTasks;

import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.ClaimBillDetailMapper;
import com.junling.mis.mapper.primary.ClaimBillMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.ClaimBillDetail;
import com.junling.mis.model.secondary.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Component
public class SynchronizeClaimBillDetail {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizeClaimBillDetail.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    VisitPersonEntityMapper visitPersonEntityMapper;

    @Autowired
    TpaClientEntityMapper tpaClientEntityMapper;

    @Autowired
    TpaPolClientRelationEntityMapper tpaPolClientRelationEntityMapper;

    @Autowired
    ClaimBillEntityMapper claimBillEntityMapper;

    @Autowired
    ClaimMainEntityMapper claimMainEntityMapper;

    @Autowired
    ClaimBillDetailMapper claimBillDetailMapper;

    @Autowired
    ClaimBillMapper claimBillMapper;

    @Autowired
    ClaimLiabCalEntityMapper claimLiabCalEntityMapper;

    @Autowired
    ClaimBillFeeEntityMapper claimBillFeeEntityMapper;


    public void myTask(String claimBillId, Integer index) throws ParseException {
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        VisitRecordEntity visitRecordEntity = visitRecordEntityMapper.selectByPrimaryKey("B3693879301211136");
        list.add(visitRecordEntity);

        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            VisitPersonEntity visitPersonEntity = visitPersonEntityMapper.selectByPrimaryKey(record.getPersonId());
            TpaClientEntity tpaClientEntity = tpaClientEntityMapper.selectByIdNo(visitPersonEntity.getCardId());
            TpaPolClientRelationEntity tpaPolClientRelationEntity = tpaPolClientRelationEntityMapper.selectByInsuredId(tpaClientEntity.getId());
            try {
                LOG.info("保存账单明细信息表");
                List<ClaimBillEntity> listClaimBillEntity = claimBillEntityMapper.selectByDocuno(record.getId());
                List<ClaimBillFeeEntity> claimBillFeeEntity = claimBillFeeEntityMapper.selectByDocuno(record.getId());
                List<ClaimLiabCalEntity> listClaimLiabCalEntity = claimLiabCalEntityMapper.selectByDocuno(record.getId());
                ClaimBillEntity claimBillEntity = listClaimBillEntity.get(index);
                ClaimLiabCalEntity claimLiabCalEntity = listClaimLiabCalEntity.get(index);

                for (int j = 0; j < claimBillFeeEntity.size(); j++) {
                    if (claimBillDetailMapper.selectByClaimBillDetailId(String.valueOf(claimBillFeeEntity.get(j).getId())) != null) {
                        LOG.info("数据" + claimBillFeeEntity.get(j).getId() + "已存在");
                    } else {
                        ClaimBillDetail claimBillDetail = new ClaimBillDetail();
//                    String claimBillDetailId = GetUUID32.getUUID32();
                        claimBillDetail.setClaimBillDetailId(String.valueOf(claimBillFeeEntity.get(j).getId()));
                        claimBillDetail.setClaimBillId(claimBillId);
                        claimBillDetail.setClaimBillNo(claimBillEntity.getReceiptno());
                        //待定
                        claimBillDetail.setPaymentItemCode(claimBillFeeEntity.get(j).getReceiptno());
                        claimBillDetail.setPaymentItemName(claimBillFeeEntity.get(j).getFeeitemname());
                        claimBillDetail.setPaymentItemType(claimBillFeeEntity.get(j).getFeeitemtype());
                        claimBillDetail.setPaymentItemPrice(claimBillFeeEntity.get(j).getSumfeeamt().intValue());


                        claimBillDetail.setPolicyNo(tpaPolClientRelationEntity.getPolno());
                        claimBillDetail.setPolicyReinsuranceNo("待加");

                        claimBillDetail.setBrNo(0);
                        claimBillDetail.setInsureId(String.valueOf(record.getPersonId()));
                        claimBillDetail.setGradeLevelId(claimLiabCalEntity.getGradeLevel());

                        claimBillDetail.setProductId("待加");
                        claimBillDetail.setDutyId(claimBillFeeEntity.get(j).getBenefitCode());
                        claimBillDetail.setSubDutyId("待加");
                        claimBillDetail.setClaimItemOption(claimLiabCalEntity.getExamcomment());
                        claimBillDetail.setClaimItemResult(claimLiabCalEntity.getPayResult());
                        //金额是int类型？
                        claimBillDetail.setClaimItemAmount(Math.toIntExact(claimLiabCalEntity.getExamAmt()));
                        claimBillDetail.setClaimItemRate(Math.toIntExact((claimLiabCalEntity.getExamAmt() / claimLiabCalEntity.getBillAmt())));
                        claimBillDetail.setRejectCauseCode("待加");
                        claimBillDetail.setRejectCause(claimLiabCalEntity.getRefusePayReason());

                        claimBillDetail.setCreatedTime(date);
                        claimBillDetail.setCreatedBy("SystemTest");
                        claimBillDetail.setUpdatedTime(date);
                        claimBillDetail.setUpdatedBy("SystemTest");

                        claimBillDetailMapper.insert(claimBillDetail);
                    }
                }
            } catch (Exception e) {
                LOG.info("保存数据库失败");
            }
        }
        LOG.info("claimBillDetail success");
    }

}
