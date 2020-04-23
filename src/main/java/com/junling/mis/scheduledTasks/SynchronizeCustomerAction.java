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
    CustomerActionMapper customerActionMapper;

    @Autowired
    HospitalEntityMapper hospitalEntityMapper;


//    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
        String str="2020-04-08 19:08:10";
        Date date =  DatetimeHelper.dateHelper(str);
//        Date date = DatetimeHelper.scheduledDate();


        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            try {
                LOG.info("开始保存个人行为");
                if(customerActionMapper.selectByCustomerId(record.getApplyPersonId()) != null){
                    LOG.info("数据已存在");
                }else{
                    CustomerAction customerAction = new CustomerAction();
                    String customerActionId = GetUUID32.getUUID32();
                    customerAction.setCustomerActionId(customerActionId);
                    customerAction.setCustomerId(record.getApplyPersonId());
                    customerAction.setActionType("apply");
                    customerAction.setActionObject(String.valueOf(record.getPersonId()));
                    customerAction.setActionStartTime(DatetimeHelper.dateHelper2(record.getApplyTime()));
                    customerAction.setActionEndTime(DatetimeHelper.dateHelper2(record.getFinishTime()));
                    customerAction.setActionPlace(record.getAcciPlace());
                    customerAction.setActionDes(record.getAcciDesci());

                    customerAction.setCreatedBy("system test");
                    customerAction.setCreatedTime(date);
                    customerAction.setUpdatedBy("system test");
                    customerAction.setUpdatedTime(date);
                    customerActionMapper.insert(customerAction);
                }
            }catch (Exception e){
                LOG.info("保存数据库异常");
            }
        }
        System.out.println("customerAction success");
    }
}
