package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
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

/**
 * @author yikaizhu
 */
@Component
public class SynchronizePolicyGradeLevel {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizePolicyGradeLevel.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    VisitPersonEntityMapper visitPersonEntityMapper;

    @Autowired
    TpaClientEntityMapper tpaClientEntityMapper;

    @Autowired
    TpaPolClientRelationEntityMapper tpaPolClientRelationEntityMapper;

    @Autowired
    PolicyGradeLevelMapper policyGradeLevelMapper;

    @Autowired
    PlanBenefitEntityMapper planBenefitEntityMapper;

    public void myTask() throws ParseException {

        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        VisitRecordEntity visitRecordEntity = visitRecordEntityMapper.selectByPrimaryKey("B3693879301211136");
        list.add(visitRecordEntity);

        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            VisitPersonEntity visitPersonEntity = visitPersonEntityMapper.selectByPrimaryKey(record.getPersonId());
            TpaClientEntity tpaClientEntity = tpaClientEntityMapper.selectByIdNo(visitPersonEntity.getCardId());
            TpaPolClientRelationEntity tpaPolClientRelationEntity = tpaPolClientRelationEntityMapper.selectByInsuredId(tpaClientEntity.getId());
            if (policyGradeLevelMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno()) != null) {
                LOG.info("数据" + tpaPolClientRelationEntity.getPolno() + "已存在");
            } else {
                LOG.info("保存计划表");

                PolicyGradeLevel policyGradeLevel = new PolicyGradeLevel();
                String policyGradeLevelId = GetUUID32.getUUID32();
                policyGradeLevel.setPolicyGradeLevelId(policyGradeLevelId);
                policyGradeLevel.setPolicyNo(tpaPolClientRelationEntity.getPolno());
                policyGradeLevel.setPolicyGradeLevelNo(Integer.valueOf(tpaPolClientRelationEntity.getGradeLevel()));
                policyGradeLevel.setPolicyGradeLevelName("待加");
                policyGradeLevel.setPglCoveredArea("待加");


                //待定
                policyGradeLevel.setPglTotalPrem(1);
                policyGradeLevel.setPglBaseCoverage(1);

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
