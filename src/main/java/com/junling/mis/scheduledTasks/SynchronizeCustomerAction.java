package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.customerActionEntityMapper;
import com.junling.mis.mapper.secondary.visitApplyPersonEntityMapper;
import com.junling.mis.mapper.secondary.visitPersonEntityMapper;
import com.junling.mis.mapper.secondary.visitRecordEntityMapper;
import com.junling.mis.model.primary.customerActionEntity;
import com.junling.mis.model.secondary.visitRecordEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Component
public class SynchronizeCustomerAction {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizeRelationship.class);

    @Autowired
    visitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    visitApplyPersonEntityMapper visitApplyPersonEntityMapper;

    @Autowired
    visitPersonEntityMapper visitPersonEntityMapper;

    @Autowired
    customerActionEntityMapper customerActionEntityMapper;

    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
//        String str="2020-03-08 19:08:10";
//        Date date =  DatetimeHelper.dateHelper(str);
        String str = DatetimeHelper.now();
        Date date = DatetimeHelper.dateHelper(str);

        List<visitRecordEntity> list = visitRecordEntityMapper.search((date));
        for (int i = 0; i < list.size(); i++) {
            customerActionEntity customerActionEntity = new customerActionEntity();
            String customerActionId = GetUUID32.getUUID32();
            customerActionEntity.setCustomerActionId(customerActionId);
            customerActionEntity.setActionType(list.get(i).getRelationshipId());
            System.out.println("success");
        }
    }
}
