package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.PolicyBeneficiaryMapper;
import com.junling.mis.mapper.primary.PolicyGradeLevelMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.PolicyGradeLevel;
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
public class SynchronizePolicyGradeLevel {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizePolicyGradeLevel.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    TpaClientEntityMapper tpaClientEntityMapper;

    @Autowired
    TpaPolClientRelationEntityMapper tpaPolClientRelationEntityMapper;

    @Autowired
    TpaPolBeneficiaryEntityMapper tpaPolBeneficiaryEntityMapper;

    @Autowired
    TpaClientPolInfoEntityMapper tpaClientPolInfoEntityMapper;

    @Autowired
    PolicyBeneficiaryMapper policyBeneficiaryMapper;

    @Autowired
    TpaPolGradeLevelEntityMapper tpaPolGradeLevelEntityMapper;

    @Autowired
    PolicyGradeLevelMapper policyGradeLevelMapper;

    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            TpaClientEntity tpaClientEntity = tpaClientEntityMapper.selectByMainInsuredId(String.valueOf(record.getPersonId()));
            TpaPolClientRelationEntity tpaPolClientRelationEntity = tpaPolClientRelationEntityMapper.selectByInsuredId(Math.toIntExact(tpaClientEntity.getId()));
            TpaPolBeneficiaryEntity tpaPolBeneficiaryEntity = tpaPolBeneficiaryEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());
            TpaPolGradeLevelEntity tpaPolGradeLevelEntity = tpaPolGradeLevelEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());

            PolicyGradeLevel policyGradeLevel = new PolicyGradeLevel();
            String policyGradeLevelId = GetUUID32.getUUID32();
            policyGradeLevel.setPolicyGradeLevelId(policyGradeLevelId);
            policyGradeLevel.setPolicyNo(tpaPolBeneficiaryEntity.getPolno());
            policyGradeLevel.setPolicyGradeLevelNo(Integer.valueOf(tpaPolGradeLevelEntity.getGradeLevel()));
            policyGradeLevel.setPolicyGradeLevelName(tpaPolGradeLevelEntity.getDescription());
            policyGradeLevel.setPglCoveredArea(tpaPolGradeLevelEntity.getCoveredArea());


            //待定
            policyGradeLevel.setPglTotalPrem(0);
            policyGradeLevel.setPglBaseCoverage(0);



            policyGradeLevel.setCreatedBy("SystemTest");
            policyGradeLevel.setCreatedTime(date);
            policyGradeLevel.setUpdatedBy("SystemTest");
            policyGradeLevel.setUpdatedTime(date);
            policyGradeLevelMapper.insert(policyGradeLevel);
            System.out.println("PolicyGradeLevel success");
        }
    }

}
