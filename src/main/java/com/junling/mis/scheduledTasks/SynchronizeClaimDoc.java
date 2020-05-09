package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.mapper.primary.ClaimDocMapper;
import com.junling.mis.mapper.primary.ClaimInfoMapper;
import com.junling.mis.mapper.secondary.VisitRecordEntityMapper;
import com.junling.mis.model.primary.ClaimDoc;
import com.junling.mis.model.primary.ClaimInfo;
import com.junling.mis.model.secondary.VisitRecordEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Component
public class SynchronizeClaimDoc {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizeClaimDoc.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    ClaimDocMapper claimDocMapper;

    @Autowired
    ClaimInfoMapper claimInfoEntityMapper;


    public void myTask() throws ParseException {
        Date date = DatetimeHelper.scheduledDate();


        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        VisitRecordEntity visitRecordEntity = visitRecordEntityMapper.selectByPrimaryKey("B3693879301211136");
        list.add(visitRecordEntity);

        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            try {
                LOG.info("保存理赔影像信息表");
                ClaimInfo claimInfo = claimInfoEntityMapper.selectByClaimNo(record.getId());
                if (claimDocMapper.selectByClaimNo(claimInfo.getClaimNo()) != null) {
                    LOG.info("数据" + claimInfo.getClaimNo() +"已存在");
                }else{
                    ClaimDoc claimDoc = new ClaimDoc();
                    claimDoc.setClaimInfoId(claimInfo.getClaimInfoId());
                    claimDoc.setClaimNo(claimInfo.getClaimNo());

                    claimDoc.setCreatedBy("SystemTest");
                    claimDoc.setCreatedTime(date);
                    claimDoc.setUpdatedBy("SystemTest");
                    claimDoc.setUpdatedTime(date);
                    claimDocMapper.insert(claimDoc);
                }
            } catch (Exception e) {
                LOG.info("保存数据库失败");
            }
        }
        LOG.info("claimDoc success");
    }


}
