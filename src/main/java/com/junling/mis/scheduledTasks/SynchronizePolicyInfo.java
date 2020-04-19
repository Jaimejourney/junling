package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.PolicyInfoMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.PolicyInfo;
import com.junling.mis.model.secondary.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Component
public class SynchronizePolicyInfo {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizePolicyInfo.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    TpaClientEntityMapper tpaClientEntityMapper;

    @Autowired
    TpaPolClientRelationEntityMapper tpaPolClientRelationEntityMapper;

    @Autowired
    TpaPolMainEntityMapper tpaPolMainEntityMapper;

    @Autowired
    PolicyInfoMapper policyInfoMapper;

    @Autowired
    TpaPolPlanEntityMapper tpaPolPlanEntityMapper;

    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            TpaClientEntity tpaClientEntity = tpaClientEntityMapper.selectByMainInsuredId(String.valueOf(record.getPersonId()));
            TpaPolClientRelationEntity tpaPolClientRelationEntity = tpaPolClientRelationEntityMapper.selectByInsuredId(Math.toIntExact(tpaClientEntity.getId()));
            TpaPolMainEntity tpaPolMainEntity = tpaPolMainEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());
            TpaPolPlanEntity tpaPolPlanEntity = tpaPolPlanEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());
            PolicyInfo policyInfo = new PolicyInfo();
            String policyInfoId = GetUUID32.getUUID32();
            policyInfo.setPolicyInfoId(policyInfoId);
            policyInfo.setPolicyNo(record.getClientPolIds());
            policyInfo.setProductId(tpaPolPlanEntity.getProductCode());
            policyInfo.setPolicyOrganization("待加");
            policyInfo.setIsRenew("待加");
            policyInfo.setRenewPolicyNo("待加");
            policyInfo.setPolicyPayType("待加");



            policyInfo.setCreatedBy("SystemTest");
            policyInfo.setCreatedTime(date);
            policyInfo.setUpdatedBy("SystemTest");
            policyInfo.setUpdatedTime(date);
            System.out.println("policyInfo success");
        }
    }

}
