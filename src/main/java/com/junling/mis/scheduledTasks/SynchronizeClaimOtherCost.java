package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.ClaimInfoMapper;
import com.junling.mis.mapper.primary.ClaimOtherCostMapper;
import com.junling.mis.mapper.secondary.VisitRecordEntityMapper;
import com.junling.mis.model.primary.ClaimOtherCost;
import com.junling.mis.model.secondary.VisitRecordEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Component
public class SynchronizeClaimOtherCost {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizeClaimOtherCost.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    ClaimInfoMapper claimInfoEntityMapper;

    @Autowired
    ClaimOtherCostMapper claimOtherCostMapper;

//    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));

        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            ClaimOtherCost claimOtherCost = new ClaimOtherCost();

            String otherCostId = GetUUID32.getUUID32();
            claimOtherCost.setOtherCostId(otherCostId);
            claimOtherCost.setClaimInfoId(record.getId());
            claimOtherCost.setCostType("待加");
            //待加
            claimOtherCost.setCostAmount(100);
            claimOtherCost.setEffect("待加");
            claimOtherCost.setUpTime(date);
            claimOtherCost.setRemark("待加");

            claimOtherCost.setCreatedBy("SystemTest");
            claimOtherCost.setCreatedTime(date);
            claimOtherCost.setUpdatedBy("SystemTest");
            claimOtherCost.setUpdatedTime(date);
            claimOtherCostMapper.insert(claimOtherCost);
            System.out.println("claimOtherCost success");
        }
    }

}
