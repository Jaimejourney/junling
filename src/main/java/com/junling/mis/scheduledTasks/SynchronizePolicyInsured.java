package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.PolicyInsuredMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.PolicyInsured;
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
public class SynchronizePolicyInsured {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizePolicyInsured.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    TpaClientEntityMapper tpaClientEntityMapper;

    @Autowired
    TpaPolClientRelationEntityMapper tpaPolClientRelationEntityMapper;

    @Autowired
    TpaPolMainEntityMapper tpaPolMainEntityMapper;

    @Autowired
    TpaClientPolInfoEntityMapper tpaClientPolInfoEntityMapper;

    @Autowired
    PolicyInsuredMapper policyInfoMapper;

    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            TpaClientEntity tpaClientEntity = tpaClientEntityMapper.selectByMainInsuredId(String.valueOf(record.getPersonId()));
            TpaPolClientRelationEntity tpaPolClientRelationEntity = tpaPolClientRelationEntityMapper.selectByInsuredId(Math.toIntExact(tpaClientEntity.getId()));
            TpaClientPolInfoEntity tpaClientPolInfoEntity = tpaClientPolInfoEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());
            PolicyInsured policyInsured = new PolicyInsured();
            String policyInsuredId = GetUUID32.getUUID32();
            policyInsured.setPolicyInsuredId(policyInsuredId);
            policyInsured.setPolicyNo(tpaClientPolInfoEntity.getPolno());
            policyInsured.setPolicyReinsuranceNo(tpaClientPolInfoEntity.getCertno());
            policyInsured.setProductId(tpaClientPolInfoEntity.getProductCode());
            policyInsured.setInsureId(tpaClientPolInfoEntity.getInsuredId());


            policyInsured.setCreatedBy("SystemTest");
            policyInsured.setCreatedTime(date);
            policyInsured.setUpdatedBy("SystemTest");
            policyInsured.setUpdatedTime(date);


            System.out.println("PolicyInsured success");
        }
    }

}
