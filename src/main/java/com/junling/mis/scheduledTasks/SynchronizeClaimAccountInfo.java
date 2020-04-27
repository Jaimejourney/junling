package com.junling.mis.scheduledTasks;

import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.ClaimAccountInfoMapper;
import com.junling.mis.mapper.primary.ClaimInfoMapper;
import com.junling.mis.mapper.secondary.ClaimAccountInfoEntity1Mapper;
import com.junling.mis.mapper.secondary.VisitRecordEntityMapper;
import com.junling.mis.model.primary.ClaimAccountInfo;
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
public class SynchronizeClaimAccountInfo {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizeClaimAccountInfo.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    ClaimInfoMapper claimInfoEntityMapper;

    @Autowired
    ClaimAccountInfoEntity1Mapper claimAccountInfoEntity1Mapper;

    @Autowired
    ClaimAccountInfoMapper claimAccountInfoMapper;

    @Autowired
    ClaimInfoMapper claimInfoMapper;

    public void myTask() throws ParseException {
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        VisitRecordEntity visitRecordEntity = visitRecordEntityMapper.selectByPrimaryKey("B3093336818435072");
        list.add(visitRecordEntity);

        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            try {
                LOG.info("保存理赔账户信息表");
                ClaimInfo claimInfo = claimInfoMapper.selectByClaimNo(record.getId());
                if (claimAccountInfoMapper.selectByClaimInfoId(claimInfo.getClaimInfoId()) != null) {
                    LOG.info("数据:" + claimInfo.getClaimInfoId() + "已存在" );
                } else {
                    ClaimAccountInfo claimAccountInfo = new ClaimAccountInfo();
                    String accountId = GetUUID32.getUUID32();
                    claimAccountInfo.setAccountId(accountId);
                    claimAccountInfo.setClaimInfoId(claimInfo.getClaimInfoId());
                    claimAccountInfo.setAccountName(record.getDocuno());

                    claimAccountInfo.setCreatedBy("SystemTest");
                    claimAccountInfo.setCreatedTime(date);
                    claimAccountInfo.setUpdatedBy("SystemTest");
                    claimAccountInfo.setUpdatedTime(date);
                    claimAccountInfoMapper.insert(claimAccountInfo);
                }
            } catch (Exception e) {
                LOG.info("保存数据库失败");
            }
        }
        LOG.info("ClaimAccountInfo success");
    }

}
