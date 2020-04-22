package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.mapper.primary.CustomerBankInfoMapper;
import com.junling.mis.mapper.secondary.VisitBankEntityMapper;
import com.junling.mis.mapper.secondary.VisitRecordEntityMapper;
import com.junling.mis.model.primary.CustomerBankInfo;
import com.junling.mis.model.secondary.VisitBankEntity;
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
public class SynchronizeCustomerBankInfo {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizeCustomerBankInfo.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    VisitBankEntityMapper visitBankEntityMapper;

    @Autowired
    CustomerBankInfoMapper customerBankInfoMapper;

    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));

        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            VisitBankEntity visitBankEntity = visitBankEntityMapper.selectByOpenId(record.getOpenid());
            try {
                LOG.info("保存客户银行信息表");
                CustomerBankInfo customerBankInfo = new CustomerBankInfo();

                customerBankInfo.setAccountId(String.valueOf(visitBankEntity.getId()));
                customerBankInfo.setCustomerNo(record.getApplyPersonId());
                customerBankInfo.setAccountName(visitBankEntity.getName());
                customerBankInfo.setAccountNo(visitBankEntity.getAccount());
                customerBankInfo.setBankNo(visitBankEntity.getBank());

                customerBankInfo.setCreatedBy("SystemTest");
                customerBankInfo.setCreatedTime(date);
                customerBankInfo.setUpdatedBy("SystemTest");
                customerBankInfo.setUpdatedTime(date);
                customerBankInfoMapper.insert(customerBankInfo);
            }catch (Exception e){
                LOG.info("保存数据库失败");
            }
        }
        System.out.println("customerBankInfo success");
    }

}
