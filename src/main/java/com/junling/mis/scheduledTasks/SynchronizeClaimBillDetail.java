package com.junling.mis.scheduledTasks;
import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.ClaimBillDetailMapper;
import com.junling.mis.mapper.primary.ClaimBillMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.ClaimBillDetail;
import com.junling.mis.model.secondary.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Component
public class SynchronizeClaimBillDetail {
    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

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


//    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask(String claimBillId) throws ParseException {
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));

        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            ClaimBillEntity claimBillEntity = claimBillEntityMapper.selectByDocuno(record.getDocuno());
            ClaimBillFeeEntity claimBillFeeEntity = claimBillFeeEntityMapper.selectByDocuno(record.getId());
            ClaimLiabCalEntity claimLiabCalEntity = claimLiabCalEntityMapper.selectByDocuno(record.getDocuno());

            ClaimBillDetail claimBillDetail = new ClaimBillDetail();
            String claimBillDetailId = GetUUID32.getUUID32();
            claimBillDetail.setClaimBillDetailId(claimBillDetailId);
            claimBillDetail.setClaimBillId(claimBillId);
            claimBillDetail.setClaimBillNo(claimBillEntity.getReceiptno());
            //待定
            claimBillDetail.setPaymentItemCode(claimBillFeeEntity.getReceiptno());
            claimBillDetail.setPaymentItemName(claimBillFeeEntity.getFeeitemname());
            claimBillDetail.setPaymentItemType(claimBillFeeEntity.getFeeitemtype());

            claimBillDetail.setPolicyNo(claimBillFeeEntity.getPolno());
            claimBillDetail.setPolicyReinsuranceNo("待加");

            claimBillDetail.setProductId("待加");
            claimBillDetail.setProductId(claimBillFeeEntity.getBenefitCode());
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
            System.out.println("claimBillDetail success");
        }
    }

}
