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
    PolicyBeneficiaryMapper policyBeneficiaryMapper;

    @Autowired
    TpaPolGradeLevelEntityMapper tpaPolGradeLevelEntityMapper;

    @Autowired
    PolicyGradeLevelMapper policyGradeLevelMapper;

    @Autowired
    PlanPremEntityMapper planPremEntityMapper;

    @Autowired
    PlanBenefitEntityMapper planBenefitEntityMapper;

    public void myTask() throws ParseException {

        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        VisitRecordEntity visitRecordEntity = visitRecordEntityMapper.selectByPrimaryKey("B3093336818435072");
        list.add(visitRecordEntity);

        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            if (policyGradeLevelMapper.selectByPolNo(record.getClientPolIds()) != null) {
                LOG.info("数据" + record.getClientPolIds() + "已存在");
            } else {
                TpaPolGradeLevelEntity tpaPolGradeLevelEntity = tpaPolGradeLevelEntityMapper.selectByPolNo(record.getClientPolIds());
                PlanBenefitEntity planBenefitEntity = planBenefitEntityMapper.selectByGradeLevel(tpaPolGradeLevelEntity.getGradeLevel());
                PlanPremEntity planPremEntity = planPremEntityMapper.selectByPlanCode(planBenefitEntity.getPlanCode());

                PolicyGradeLevel policyGradeLevel = new PolicyGradeLevel();
                String policyGradeLevelId = GetUUID32.getUUID32();
                policyGradeLevel.setPolicyGradeLevelId(policyGradeLevelId);
                policyGradeLevel.setPolicyNo(record.getClientPolIds());
                policyGradeLevel.setPolicyGradeLevelNo(Integer.valueOf(tpaPolGradeLevelEntity.getGradeLevel()));
                policyGradeLevel.setPolicyGradeLevelName(tpaPolGradeLevelEntity.getDescription());
                policyGradeLevel.setPglCoveredArea(tpaPolGradeLevelEntity.getCoveredArea());


                //待定
//                policyGradeLevel.setPglTotalPrem(Integer.valueOf(planPremEntity.getPrem()));
                policyGradeLevel.setPglTotalPrem(1);
                policyGradeLevel.setPglBaseCoverage(Math.toIntExact(planBenefitEntity.getDeductibleAmout()));

                policyGradeLevel.setCreatedBy("SystemTest");
                policyGradeLevel.setCreatedTime(date);
                policyGradeLevel.setUpdatedBy("SystemTest");
                policyGradeLevel.setUpdatedTime(date);
                policyGradeLevelMapper.insert(policyGradeLevel);
            }
        }
        LOG.info("PolicyGradeLevel success");
    }

}
