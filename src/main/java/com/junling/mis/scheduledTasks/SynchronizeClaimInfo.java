package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.ClaimInfoMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.ClaimBillDiagnose;
import com.junling.mis.model.primary.ClaimInfo;
import com.junling.mis.model.secondary.ClaimBillDiagnoseEntity;
import com.junling.mis.model.secondary.VisitRecordEntity;
import com.junling.mis.model.secondary.VisitRecordRenbaojianDetailEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Component
public class SynchronizeClaimInfo {

    private final static Logger LOG = LoggerFactory.getLogger(SynchronizeClaimInfo.class);

//    private LongIdWorker longIdWorker = IDFactory.createIDWorker();

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    VisitRecordRenbaojianDetailEntityMapper visitRecordRenbaojianDetailEntityMapper;

    @Autowired
    VisitApplyPersonEntityMapper visitApplyPersonEntityMapper;

    @Autowired
    VisitPersonEntityMapper visitPersonEntityMapper;

    @Autowired
    ClaimInfoMapper claimInfoMapper;

    @Autowired
    ClaimBillDiagnoseEntityMapper claimBillDiagnoseEntityMapper;

//0/5 * * * * *
    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));

        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            VisitRecordRenbaojianDetailEntity visitRecordRenbaojianDetailEntity= visitRecordRenbaojianDetailEntityMapper.selectByPrimaryKey(record.getId());
            ClaimInfo claimInfo = new ClaimInfo();
            String claimInfoId = GetUUID32.getUUID32();
            claimInfo.setClaimInfoId(claimInfoId);
            claimInfo.setClaimNo(record.getId());
            claimInfo.setRegistrationNo(record.getDocuno());
            claimInfo.setReportNo(visitRecordRenbaojianDetailEntity.getMaYiCaseNo());
            claimInfo.setClaimReportId(String.valueOf(record.getPersonId()));
            claimInfo.setInsureId(record.getApplyPersonId());
            claimInfo.setAccidentType(visitRecordRenbaojianDetailEntity.getAccidentType());
            claimInfo.setReportTime(DatetimeHelper.dateHelper(record.getApplyTime()));
            claimInfo.setClaimStatus(String.valueOf(record.getStatus()));
            claimInfo.setClaimSoucreType(record.getClaimType());
            claimInfo.setCreatedBy("SystemTest");
            claimInfo.setCreatedTime(date);
            claimInfo.setUpdatedBy("SystemTest");
            claimInfo.setUpdatedTime(date);
            claimInfoMapper.insert(claimInfo);
            System.out.println("claimInfo success");
        }

        SynchronizeClaimDoc synchronizeClaimDoc = new SynchronizeClaimDoc();
        synchronizeClaimDoc.myTask();

        SynchronizeClaimBill synchronizeClaimBill = new SynchronizeClaimBill();
        synchronizeClaimBill.myTask();
    }
}
