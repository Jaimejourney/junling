package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
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

import javax.annotation.PostConstruct;
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


    //    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
        String str = "2020-04-08 19:08:10";
        Date date = DatetimeHelper.dateHelper(str);
//        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));

        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            try {
                LOG.info("保存理赔影像信息表");
                ClaimInfo claimInfo = claimInfoEntityMapper.selectByClaimNo(record.getId());
                if (claimDocMapper.selectByClaimNo(claimInfo.getClaimNo()) != null) {
                    LOG.info("数据已存在");
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
        System.out.println("claimDoc success");
    }


}
