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

    public void myTask() throws ParseException {
//        String str="2020-04-08 19:08:10";
//        Date date =  DatetimeHelper.dateHelper(str);
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));


        VisitRecordEntity visitRecordEntity = visitRecordEntityMapper.selectByPrimaryKey("B3693879301211136");
        list.add(visitRecordEntity);
        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            try {
                CustomerInfo customerVisitApplyPersonEntity = new CustomerInfo();
                VisitApplyPersonEntity visitApplyPersonEntity = visitApplyPersonEntityMapper.selectByPrimaryKey(new BigDecimal(record.getApplyPersonId()));
                if (customerInfoEntityMapper.selectByIdNo(visitApplyPersonEntity.getCardId()) != null) {
                    LOG.info("数据已存在");
                } else {
                    LOG.info("开始保存申请人");
                    String applyCustomerNo = GetUUID32.getUUID32();
                    customerVisitApplyPersonEntity.setCustomerNo(applyCustomerNo);
                    customerVisitApplyPersonEntity.setCustomerName(visitApplyPersonEntity.getName());
                    customerVisitApplyPersonEntity.setNickName("待定");
                    customerVisitApplyPersonEntity.setCustomerLevelCode("待定");
                    customerVisitApplyPersonEntity.setCustomerScore("0");
                    customerVisitApplyPersonEntity.setCustomerPhoneNo(visitApplyPersonEntity.getPhone());
                    customerVisitApplyPersonEntity.setBirthDistrictCode("待定");
                    customerVisitApplyPersonEntity.setDistrictCode("待定");

                    customerVisitApplyPersonEntity.setIdNo(visitApplyPersonEntity.getCardId());
                    customerVisitApplyPersonEntity.setIdType("待定");
                    customerVisitApplyPersonEntity.setEmail(visitApplyPersonEntity.getEmail());
                    customerVisitApplyPersonEntity.setAddress("待定");
                    customerVisitApplyPersonEntity.setCreatedBy("system test");
                    customerVisitApplyPersonEntity.setCreatedTime(date);
                    customerVisitApplyPersonEntity.setUpdatedBy("system test");
                    customerVisitApplyPersonEntity.setUpdatedTime(date);
                    customerInfoEntityMapper.insert(customerVisitApplyPersonEntity);
                }
            } catch (Exception e) {
                LOG.info("保存数据库异常");
            }

            try {
                LOG.info("开始保存就诊人");

                CustomerInfo customerVisitPersonEntity = new CustomerInfo();
                VisitPersonEntity visitPersonEntity = visitPersonEntityMapper.selectByPrimaryKey(record.getPersonId());
                if (customerInfoEntityMapper.selectByIdNo(visitPersonEntity.getCardId()) != null) {
                    LOG.info("数据" + visitPersonEntity.getCardId() + "已存在");
                } else {
                    String customerNo = GetUUID32.getUUID32();
                    customerVisitPersonEntity.setCustomerNo(customerNo);
                    customerVisitPersonEntity.setCustomerName(visitPersonEntity.getName());
                    customerVisitPersonEntity.setNickName("待定");
                    customerVisitPersonEntity.setCustomerLevelCode("待定");
                    customerVisitPersonEntity.setCustomerScore("0");
                    customerVisitPersonEntity.setCustomerPhoneNo(visitPersonEntity.getPhone());
                    customerVisitPersonEntity.setBirthDistrictCode("待定");
                    customerVisitPersonEntity.setDistrictCode("待定");

                    customerVisitPersonEntity.setIdNo(visitPersonEntity.getCardId());
                    customerVisitPersonEntity.setIdType("待定");
                    customerVisitPersonEntity.setEmail(visitPersonEntity.getEmail());
                    customerVisitPersonEntity.setAddress("待定");
                    customerVisitPersonEntity.setCreatedBy("system test");
                    customerVisitPersonEntity.setCreatedTime(date);
                    customerVisitPersonEntity.setUpdatedBy("system test");
                    customerVisitPersonEntity.setUpdatedTime(date);
                    customerInfoEntityMapper.insert(customerVisitPersonEntity);
                }
            } catch (Exception e) {
                LOG.info("保存数据库异常");
            }
        }
        LOG.info("customerInfo success");
    }
}
