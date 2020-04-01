package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.claimInfoEntityMapper;
import com.junling.mis.mapper.secondary.visitApplyPersonEntityMapper;
import com.junling.mis.mapper.secondary.visitPersonEntityMapper;
import com.junling.mis.mapper.secondary.visitRecordEntityMapper;
import com.junling.mis.mapper.secondary.visitRecordRenbaojianDetailEntityMapper;
import com.junling.mis.model.primary.claimInfoEntity;
import com.junling.mis.model.secondary.visitRecordEntity;
import com.junling.mis.model.secondary.visitRecordRenbaojianDetailEntity;
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
    visitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    visitRecordRenbaojianDetailEntityMapper visitRecordRenbaojianDetailEntityMapper;

    @Autowired
    visitApplyPersonEntityMapper visitApplyPersonEntityMapper;

    @Autowired
    visitPersonEntityMapper visitPersonEntityMapper;

    @Autowired
    claimInfoEntityMapper claimInfoEntityMapper;

//0/5 * * * * *
    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
        String str = DatetimeHelper.now();
        Date date = DatetimeHelper.dateHelper(str);


        List<visitRecordEntity> list = visitRecordEntityMapper.search((date));
        for (int i = 0; i < list.size(); i++) {
            visitRecordRenbaojianDetailEntity visitRecordRenbaojianDetailEntity= visitRecordRenbaojianDetailEntityMapper.selectByPrimaryKey(list.get(i).getId());
            claimInfoEntity claimInfoEntity = new claimInfoEntity();
            String claimInfoId = GetUUID32.getUUID32();
            claimInfoEntity.setClaimInfoId(claimInfoId);
            claimInfoEntity.setClaimNo(list.get(i).getId());
            claimInfoEntity.setRegistrationNo(list.get(i).getDocuno());
            claimInfoEntity.setReportNo(visitRecordRenbaojianDetailEntity.getMaYiCaseNo());
            claimInfoEntityMapper.insert(claimInfoEntity);
            System.out.println("success");
        }
    }
}
