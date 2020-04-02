package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.customerRelationEntityMapper;
import com.junling.mis.mapper.secondary.visitApplyPersonEntityMapper;
import com.junling.mis.mapper.secondary.visitPersonEntityMapper;
import com.junling.mis.mapper.secondary.visitRecordEntityMapper;
import com.junling.mis.model.primary.customerRelationEntity;
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
public class SynchronizeRelationship {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizeRelationship.class);

    @Autowired
    visitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    customerRelationEntityMapper customerRelationEntityMapper;

    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
//        String str="2020-03-08 19:08:10";
//        Date date =  DatetimeHelper.dateHelper(str);
        Date date = DatetimeHelper.scheduledDate();

        List<visitRecordEntity> list = visitRecordEntityMapper.search((date));
        for (int i = 0; i < list.size(); i++) {
            visitRecordEntity record = list.get(i);
            customerRelationEntity customerRelationEntity = new customerRelationEntity();
            String customerRelationId = GetUUID32.getUUID32();
            customerRelationEntity.setCustomerRelationId(customerRelationId);
            customerRelationEntity.setCustomerOrganizationId(record.getApplyPersonId());
            customerRelationEntity.setRelationType(record.getRelationshipId());
            customerRelationEntity.setRelationCustomer(String.valueOf(record.getPersonId()));
            customerRelationEntity.setRelationStartTime(DatetimeHelper.dateTransferHelper(record.getApplyTime()));
            customerRelationEntity.setRelationEndTime(DatetimeHelper.dateTransferHelper(record.getFinishTime()));
            customerRelationEntity.setRelationStatus("1");
            customerRelationEntity.setCreatedBy("sysetem test");
            customerRelationEntity.setCreatedTime(date);
            customerRelationEntity.setUpdatedBy("system test");
            customerRelationEntity.setUpdatedTime(date);
            customerRelationEntityMapper.insert(customerRelationEntity);
            System.out.println("success");
        }
    }
}
