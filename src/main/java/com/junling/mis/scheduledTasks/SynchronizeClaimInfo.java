package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.ClaimInfoMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.ClaimInfo;
import com.junling.mis.model.secondary.VisitRecordEntity;
import com.junling.mis.model.secondary.VisitRecordRenbaojianDetailEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * @author yikaizhu
 */
@Component
public class SynchronizeClaimInfo {

    private final static Logger LOG = LoggerFactory.getLogger(SynchronizeClaimInfo.class);

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

    @Autowired
    SynchronizeClaimDoc synchronizeClaimDoc;

    @Autowired
    SynchronizeClaimBill synchronizeClaimBill;

    @Autowired
    SynchronizeClaimAccountInfo synchronizeClaimAccountInfo;

//0/5 * * * * *

    public void myTask() throws ParseException {
//        String str = "2020-04-08 19:08:10";
//        Date date = DatetimeHelper.dateHelper(str);
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        VisitRecordEntity visitRecordEntity = visitRecordEntityMapper.selectByPrimaryKey("B3693879301211136");
        list.add(visitRecordEntity);


        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            try {
                LOG.info("保存理赔报案和报案信息表");
                VisitRecordRenbaojianDetailEntity visitRecordRenbaojianDetailEntity = visitRecordRenbaojianDetailEntityMapper.selectByPrimaryKey(record.getId());
                if (claimInfoMapper.selectByClaimNo(record.getId()) != null) {
                    LOG.info("数据" + record.getId() + "已存在");
                } else {
                    ClaimInfo claimInfo = new ClaimInfo();
                    String claimInfoId = GetUUID32.getUUID32();
                    claimInfo.setClaimInfoId(claimInfoId);
                    claimInfo.setClaimNo(record.getId());
                    claimInfo.setReportNo(visitRecordRenbaojianDetailEntity.getMaYiCaseNo());
                    claimInfo.setRegistrationNo(record.getDocuno());

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
                }
            } catch (Exception e) {
                LOG.info("保存数据库失败");
            }
        }

        synchronizeClaimDoc.myTask();
        synchronizeClaimBill.myTask();
        synchronizeClaimAccountInfo.myTask();
        LOG.info("claimInfo success");
    }
}
