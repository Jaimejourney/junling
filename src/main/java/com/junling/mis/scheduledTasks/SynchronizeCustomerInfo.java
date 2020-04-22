package com.junling.mis.scheduledTasks;

import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.CustomerInfoMapper;
import com.junling.mis.mapper.secondary.VisitApplyPersonEntityMapper;
import com.junling.mis.mapper.secondary.VisitPersonEntityMapper;
import com.junling.mis.mapper.secondary.VisitRecordEntityMapper;
import com.junling.mis.model.primary.CustomerInfo;
import com.junling.mis.model.secondary.VisitApplyPersonEntity;
import com.junling.mis.model.secondary.VisitPersonEntity;
import com.junling.mis.model.secondary.VisitRecordEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Component
public class SynchronizeCustomerInfo {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizeCustomerInfo.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    VisitApplyPersonEntityMapper visitApplyPersonEntityMapper;

    @Autowired
    VisitPersonEntityMapper visitPersonEntityMapper;

    @Autowired
    CustomerInfoMapper customerInfoEntityMapper;

    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
//        String str="2020-04-08 19:08:10";
//        Date date =  DatetimeHelper.dateHelper(str);
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));

        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            CustomerInfo customerVisitApplyPersonEntity = new CustomerInfo();
            VisitApplyPersonEntity visitApplyPersonEntity = visitApplyPersonEntityMapper.selectByPrimaryKey(new BigDecimal(record.getApplyPersonId()));
            try {
                LOG.info("开始保存申请人");
                String applyCustomerNo = GetUUID32.getUUID32();
                customerVisitApplyPersonEntity.setCustomerNo(applyCustomerNo);
                //姓名
                customerVisitApplyPersonEntity.setCustomerName(visitApplyPersonEntity.getName());
                //手机号
                customerVisitApplyPersonEntity.setCustomerPhoneNo(visitApplyPersonEntity.getPhone());
                //邮箱
                customerVisitApplyPersonEntity.setEmail(visitApplyPersonEntity.getEmail());
                //证件号
                customerVisitApplyPersonEntity.setIdNo(visitApplyPersonEntity.getCardId());
                customerVisitApplyPersonEntity.setCreatedBy("system test");
                customerVisitApplyPersonEntity.setCreatedTime(date);
                customerVisitApplyPersonEntity.setUpdatedBy("system test");
                customerVisitApplyPersonEntity.setUpdatedTime(date);
                customerInfoEntityMapper.insert(customerVisitApplyPersonEntity);
            }catch (Exception e){
                LOG.info("保存数据库异常");
            }

            try {
                LOG.info("开始保存就诊人");

                CustomerInfo customerVisitPersonEntity = new CustomerInfo();
                VisitPersonEntity visitPersonEntity = visitPersonEntityMapper.selectByPrimaryKey(record.getPersonId());
                String customerNo = GetUUID32.getUUID32();
                customerVisitPersonEntity.setCustomerNo(customerNo);
                //姓名
                customerVisitPersonEntity.setCustomerName(visitPersonEntity.getName());
                //手机号
                customerVisitPersonEntity.setCustomerPhoneNo(visitPersonEntity.getPhone());
                //邮箱
                customerVisitPersonEntity.setEmail(visitPersonEntity.getEmail());
                //证件号
                customerVisitPersonEntity.setIdNo(visitPersonEntity.getCardId());
                customerVisitPersonEntity.setCreatedBy("system test");
                customerVisitPersonEntity.setCreatedTime(date);
                customerVisitPersonEntity.setUpdatedBy("system test");
                customerVisitPersonEntity.setUpdatedTime(date);
                customerInfoEntityMapper.insert(customerVisitPersonEntity);
            }catch (Exception e){
                LOG.info("保存数据库异常");
            }
        }
        System.out.println("customerInfo success");
    }
}
