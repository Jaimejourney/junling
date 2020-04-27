package com.junling.mis.scheduledTasks;

import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.ClaimInfoMapper;
import com.junling.mis.mapper.primary.ClaimInvestigationInfoMapper;
import com.junling.mis.mapper.secondary.VisitRecordEntityMapper;
import com.junling.mis.model.primary.ClaimInvestigationInfo;
import com.junling.mis.model.secondary.VisitRecordEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Component
public class SynchronizeClaimInvestigatoinInfo {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizeClaimInvestigatoinInfo.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    ClaimInfoMapper claimInfoEntityMapper;

    @Autowired
    ClaimInvestigationInfoMapper claimInvestigationInfoMapper;


    public void myTask() throws ParseException {
        Date date = DatetimeHelper.scheduledDate();
        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        VisitRecordEntity visitRecordEntity = visitRecordEntityMapper.selectByPrimaryKey("B3093336818435072");
        list.add(visitRecordEntity);


        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            try {
                LOG.info("保存调查表");
                if (claimInvestigationInfoMapper.selectByClaimNo(record.getId()) != null) {
                    LOG.info("数据" + record.getId() + "已存在");
                } else {
                    ClaimInvestigationInfo claimInvestigationInfo = new ClaimInvestigationInfo();

                    String claimInvestigationInfoId = GetUUID32.getUUID32();
                    claimInvestigationInfo.setClaimInvestigationInfoId(claimInvestigationInfoId);
                    claimInvestigationInfo.setClaimNo(record.getId());
                    claimInvestigationInfo.setReplyTime("待加");

                    claimInvestigationInfo.setCreatedBy("SystemTest");
                    claimInvestigationInfo.setCreatedTime(date);
                    claimInvestigationInfo.setUpdatedBy("SystemTest");
                    claimInvestigationInfo.setUpdatedTime(date);
                    claimInvestigationInfoMapper.insert(claimInvestigationInfo);
                }
            } catch (Exception e) {
                LOG.info("保存数据库失败");
            }
        }
        LOG.info("claimInvestigationInfo success");
    }

}
