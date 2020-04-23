package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.PolicyInsuredMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.PolicyInsuredService;
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

public class SynchronizePolicyInsuredService {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizePolicyInsuredService.class);

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

    @Autowired
    TpaPolGradeLevelEntityMapper tpaPolGradeLevelEntityMapper;

//    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            TpaClientEntity tpaClientEntity = tpaClientEntityMapper.selectByMainInsuredId(String.valueOf(record.getPersonId()));
            TpaPolClientRelationEntity tpaPolClientRelationEntity = tpaPolClientRelationEntityMapper.selectByInsuredId(Math.toIntExact(tpaClientEntity.getId()));
            TpaClientPolInfoEntity tpaClientPolInfoEntity = tpaClientPolInfoEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());
            TpaPolGradeLevelEntity tpaPolGradeLevelEntity = tpaPolGradeLevelEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());


            PolicyInsuredService policyInsuredService = new PolicyInsuredService();
            String policyInsuredServiceId = GetUUID32.getUUID32();
            policyInsuredService.setPolicyInsuredServiceId(policyInsuredServiceId);
            policyInsuredService.setPolicyNo(tpaClientPolInfoEntity.getPolno());
            policyInsuredService.setPolicyReinsuranceNo(tpaClientPolInfoEntity.getCertno());
            policyInsuredService.setBrNo(0);
            policyInsuredService.setInsureId(tpaClientPolInfoEntity.getInsuredId());
            policyInsuredService.setPolicyGradeLevelId(tpaPolGradeLevelEntity.getGradeLevel());
            policyInsuredService.setProductId(tpaClientPolInfoEntity.getProductCode());

            //待加
            policyInsuredService.setServiceCode("待加");
            policyInsuredService.setServiceType("待加");
            policyInsuredService.setServiceTime(1);
            policyInsuredService.setServiceStatus("待加");
            policyInsuredService.setServiceTimeLeft(1);


            policyInsuredService.setCreatedBy("SystemTest");
            policyInsuredService.setCreatedTime(date);
            policyInsuredService.setUpdatedBy("SystemTest");
            policyInsuredService.setUpdatedTime(date);


            System.out.println("PolicyInsuredService success");
        }
    }

}
