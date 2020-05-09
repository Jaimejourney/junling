package com.junling.mis.scheduledTasks;

import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.mapper.primary.CustomerBankInfoMapper;
import com.junling.mis.mapper.secondary.ClaimAccountInfoEntity1Mapper;
import com.junling.mis.mapper.secondary.VisitRecordEntityMapper;
import com.junling.mis.model.primary.CustomerBankInfo;
import com.junling.mis.model.secondary.ClaimAccountInfoEntity;
import com.junling.mis.model.secondary.VisitRecordEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    ClaimAccountInfoEntity1Mapper claimAccountInfoEntity1Mapper;

    @Autowired
    CustomerBankInfoMapper customerBankInfoMapper;

    public void myTask() throws ParseException {
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        VisitRecordEntity visitRecordEntity = visitRecordEntityMapper.selectByPrimaryKey("B3693879301211136");
        list.add(visitRecordEntity);

        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            ClaimAccountInfoEntity claimAccountInfoEntity = claimAccountInfoEntity1Mapper.selectByDocuno(record.getId());
            try {
                LOG.info("保存客户银行信息表");
                if (customerBankInfoMapper.selectByCustomerNo(record.getApplyPersonId()) != null) {
                    LOG.info("数据" + record.getApplyPersonId() + "已存在");
                } else {
                    CustomerBankInfo customerBankInfo = new CustomerBankInfo();

                    customerBankInfo.setAccountId(claimAccountInfoEntity.getId());
                    customerBankInfo.setCustomerNo(record.getApplyPersonId());
                    customerBankInfo.setAccountName(claimAccountInfoEntity.getAccountName());
                    customerBankInfo.setAccountNo(claimAccountInfoEntity.getAccountNo());
                    customerBankInfo.setBankNo(claimAccountInfoEntity.getBankno());

                    customerBankInfo.setCreatedBy("SystemTest");
                    customerBankInfo.setCreatedTime(date);
                    customerBankInfo.setUpdatedBy("SystemTest");
                    customerBankInfo.setUpdatedTime(date);
                    customerBankInfoMapper.insert(customerBankInfo);
                }
            } catch (Exception e) {
                LOG.info("保存数据库失败");
            }
        }
        LOG.info("customerBankInfo success");
    }

}
