package com.junling.mis.scheduledTasks;

import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.CustomerRelationMapper;
import com.junling.mis.mapper.secondary.VisitRecordEntityMapper;
import com.junling.mis.model.primary.CustomerRelation;
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
public class SynchronizeCustomerRelationship {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizeCustomerRelationship.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    CustomerRelationMapper customerRelationEntityMapper;

    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
//        String str="2020-03-08 19:08:10";
//        Date date =  DatetimeHelper.dateHelper(str);
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            CustomerRelation customerRelationEntity = new CustomerRelation();
            String customerRelationId = GetUUID32.getUUID32();
            customerRelationEntity.setCustomerRelationId(customerRelationId);
            customerRelationEntity.setCustomerOrganizationId(record.getApplyPersonId());
            customerRelationEntity.setRelationType(record.getRelationshipId());
            customerRelationEntity.setRelationCustomer(String.valueOf(record.getPersonId()));
            customerRelationEntity.setRelationStartTime(DatetimeHelper.dateTransferHelper(record.getApplyTime()));
            customerRelationEntity.setRelationEndTime(DatetimeHelper.dateTransferHelper(record.getFinishTime()));
            //待加
            customerRelationEntity.setRelationStatus("1");
            customerRelationEntity.setCreatedBy("sysetem test");
            customerRelationEntity.setCreatedTime(date);
            customerRelationEntity.setUpdatedBy("system test");
            customerRelationEntity.setUpdatedTime(date);
            customerRelationEntityMapper.insert(customerRelationEntity);
            System.out.println("customerRelationship success");
        }
    }
}
