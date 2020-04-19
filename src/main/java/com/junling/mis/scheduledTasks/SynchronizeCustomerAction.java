package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.CustomerActionMapper;
import com.junling.mis.mapper.secondary.HospitalEntityMapper;
import com.junling.mis.mapper.secondary.VisitRecordEntityMapper;
import com.junling.mis.model.primary.CustomerAction;
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
public class SynchronizeCustomerAction {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizeCustomerAction.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    CustomerActionMapper customerActionEntityMapper;

    @Autowired
    HospitalEntityMapper hospitalEntityMapper;

    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
        Date date = DatetimeHelper.scheduledDate();


        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));

        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            CustomerAction customerActionEntity = new CustomerAction();
            String customerActionId = GetUUID32.getUUID32();
            customerActionEntity.setCustomerActionId(customerActionId);
            customerActionEntity.setCustomerId(record.getApplyPersonId());
            customerActionEntity.setActionType("apply");
            customerActionEntity.setActionObject(String.valueOf(record.getPersonId()));
            customerActionEntity.setActionStartTime(DatetimeHelper.dateHelper(record.getApplyTime()));
            customerActionEntity.setActionEndTime(DatetimeHelper.dateHelper(record.getFinishTime()));
            customerActionEntity.setActionPlace("test place");
            customerActionEntity.setActionDes("1");
            customerActionEntity.setCreatedBy("system test");
            customerActionEntity.setCreatedTime(date);
            customerActionEntity.setUpdatedBy("system test");
            customerActionEntity.setUpdatedTime(date);
            customerActionEntityMapper.insert(customerActionEntity);
            System.out.println("customerAction success");
        }
    }
}
