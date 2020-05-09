package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.ClaimBillMapper;
import com.junling.mis.mapper.primary.ClaimInfoMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.ClaimBill;
import com.junling.mis.model.primary.ClaimInfo;
import com.junling.mis.model.secondary.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Component
public class SynchronizeClaimBill {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizeClaimBill.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    ClaimBillEntityMapper claimBillEntityMapper;

    @Autowired
    ClaimMainEntityMapper claimMainEntityMapper;

    @Autowired
    ClaimBillMapper claimBillMapper;

    @Autowired
    ClaimInfoMapper claimInfoMapper;

    @Autowired
    SynchronizeClaimBillDetail synchronizeClaimBillDetail;

    @Autowired
    SynchronizeClaimBillDiagnose synchronizeClaimBillDiagnose;

    public void myTask() throws ParseException {
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        VisitRecordEntity visitRecordEntity = visitRecordEntityMapper.selectByPrimaryKey("B3693879301211136");
        list.add(visitRecordEntity);

        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            try {
                LOG.info("保存账单信息表");
                List<ClaimBillEntity> claimBillEntity = claimBillEntityMapper.selectByDocuno(record.getId());
                ClaimMainEntity claimMainEntity = claimMainEntityMapper.selectByPrimaryKey(record.getId());
                ClaimInfo claimInfo = claimInfoMapper.selectByClaimNo(record.getId());

                for (int j = 0; j < claimBillEntity.size(); j++) {
                    if (claimBillMapper.selectByClaimBillId(claimBillEntity.get(j).getSeqno()) != null) {
                        LOG.info("数据" + claimBillEntity.get(j).getSeqno() + "已存在");
                    } else {
                        ClaimBill claimBill = new ClaimBill();
//                        String claimBillId = GetUUID32.getUUID32();
                        claimBill.setClaimBillId(claimBillEntity.get(j).getSeqno());
                        claimBill.setClaimInfoId(claimInfo.getClaimInfoId());
                        claimBill.setClaimBillNo(claimBillEntity.get(j).getReceiptno());
                        claimBill.setHospitalCode(claimBillEntity.get(j).getHospitalCode());
                        claimBill.setClinicDate(claimBillEntity.get(j).getClinicDate());
                        claimBill.setFlowId(claimBillEntity.get(j).getFlowId());
                        claimBill.setAdmissionDate(claimBillEntity.get(j).getAdmissionDate());
                        claimBill.setDischargeDate(claimBillEntity.get(j).getDischargeDate());
                        claimBill.setHospitalDays(claimBillEntity.get(j).getHospitalDays());
                        claimBill.setHospitalDepartment(claimBillEntity.get(j).getHospitalDepartment());
                        claimBill.setMedicalInsuranceType(claimBillEntity.get(j).getYbType());

                        claimBill.setClaimResult("待加");
                        claimBill.setClaimStatus(String.valueOf(record.getStatus()));
                        //金额是int类型？
                        claimBill.setClaimAmount(Math.toIntExact(Math.round(record.getAmount())));
                        claimBill.setClaimSoucreType(record.getClaimType());
                        claimBill.setClaimType(claimBillEntity.get(j).getBillType());
                        claimBill.setRejectCauseCode("待加");
                        claimBill.setRejectCause("待加");
                        //金额是int类型？
                        claimBill.setBesideinsuranceMoney(Math.toIntExact(claimBillEntity.get(j).getBesideinsuranceMoney()));
                        claimBill.setTotalIndividualPayment(Math.toIntExact(claimBillEntity.get(j).getTotalIndividualPayment()));
                        claimBill.setCreatedTime(date);
                        claimBill.setCreatedBy("SystemTest");
                        claimBill.setUpdatedTime(date);
                        claimBill.setUpdatedBy("SystemTest");

                        claimBill.setMedicalCardNumber("待加");
                        claimBill.setBillAmt(Math.toIntExact(claimBillEntity.get(j).getFeeMmount()));
                        claimBill.setAccountPayment(Math.toIntExact(claimBillEntity.get(j).getAccountPayment()));
                        claimBill.setMedicalPayment(Math.toIntExact(claimBillEntity.get(j).getMedicalPayment()));
                        claimBill.setThirdPartyPaymentAmount(Math.toIntExact(claimBillEntity.get(j).getBesideinsuranceMoney()));
                        claimBill.setPersonalAmount(Math.toIntExact(claimBillEntity.get(j).getOwnExpense()));
                        claimBill.setIndividualPayment(Math.toIntExact(claimBillEntity.get(j).getIndividualPayment()));
                        claimBill.setPersonalPaymentAmount(Math.toIntExact(claimBillEntity.get(j).getPaymenta()));
                        claimBill.setCashPaidAmount(Math.toIntExact(claimBillEntity.get(j).getCashPayment()));

                        claimBillMapper.insert(claimBill);
                        synchronizeClaimBillDetail.myTask(claimBillEntity.get(j).getSeqno(), j);
                        synchronizeClaimBillDiagnose.myTask(j);
                    }
                }
            } catch (Exception e) {
                LOG.info("保存数据库失败");
            }

        }
        LOG.info("claimBill success");
    }

}
