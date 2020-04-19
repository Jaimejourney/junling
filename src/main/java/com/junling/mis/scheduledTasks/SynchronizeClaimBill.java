package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.ClaimBillMapper;
import com.junling.mis.mapper.primary.ClaimInfoMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.ClaimBill;
import com.junling.mis.model.primary.ClaimInfo;
import com.junling.mis.model.secondary.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Component
public class SynchronizeClaimBill {
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

    //    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));

        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            ClaimBillEntity claimBillEntity = claimBillEntityMapper.selectByDocuno(record.getDocuno());
            ClaimMainEntity claimMainEntity = claimMainEntityMapper.selectByPrimaryKey(record.getDocuno());
            ClaimInfo claimInfo = claimInfoMapper.selectByClaimNo(record.getId());
            ClaimBill claimBill = new ClaimBill();
            String claimBillId = GetUUID32.getUUID32();
            claimBill.setClaimBillId(claimBillId);
            claimBill.setClaimInfoId(claimInfo.getClaimInfoId());
            claimBill.setClaimBillNo(claimBillEntity.getReceiptno());
            claimBill.setClaimResult("待加");
            claimBill.setClaimStatus(String.valueOf(record.getStatus()));
            //金额是int类型？
            claimBill.setClaimAmount(Math.toIntExact(Math.round(record.getAmount())));
            claimBill.setClaimSoucreType(record.getClaimType());
            claimBill.setClaimType(claimBillEntity.getBillType());
            claimBill.setRejectCauseCode("待加");
            claimBill.setRejectCause(claimMainEntity.getRejectCause());
            //金额是int类型？
            claimBill.setBesideinsuranceMoney(Math.toIntExact(claimBillEntity.getBesideinsuranceMoney()));
            claimBill.setTotalIndividualPayment(Math.toIntExact(claimBillEntity.getTotalIndividualPayment()));
            claimBill.setCreatedTime(date);
            claimBill.setCreatedBy("SystemTest");
            claimBill.setUpdatedTime(date);
            claimBill.setUpdatedBy("SystemTest");

            claimBillMapper.insert(claimBill);
            System.out.println("claimBill success");

            //claimBillDetail
            SynchronizeClaimBillDetail synchronizeClaimBillDetail = new SynchronizeClaimBillDetail();
            synchronizeClaimBillDetail.myTask(claimBillId);
        }

        SynchronizeClaimBillDiagnose synchronizeClaimBillDiagnose = new SynchronizeClaimBillDiagnose();
        synchronizeClaimBillDiagnose.myTask();
    }

}
