package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.PolicyBeneficiaryMapper;
import com.junling.mis.mapper.primary.PolicyGradeLevelProMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.PolicyGradeLevelPro;
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
public class SynchronizePolicyGradeLevelPro {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizePolicyGradeLevelPro.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    VisitPersonEntityMapper visitPersonEntityMapper;

    @Autowired
    TpaClientEntityMapper tpaClientEntityMapper;

    @Autowired
    TpaPolClientRelationEntityMapper tpaPolClientRelationEntityMapper;

    @Autowired
    PolicyGradeLevelProMapper policyGradeLeveProlMapper;

    @Autowired
    TpaPolPlanBenefitEntityMapper tpaPolPlanBenefitEntityMapper;


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

            try {
                LOG.info("保存保单计划产品表");
                if (policyGradeLeveProlMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno()) != null) {
                    LOG.info("数据" + tpaPolClientRelationEntity.getPolno() + "已存在");
                } else {
                    List<TpaPolPlanBenefitEntity> tpaPolPlanBenefitEntity = tpaPolPlanBenefitEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());

                    PolicyGradeLevelPro policyGradeLevelPro = new PolicyGradeLevelPro();
                    String policyGradeLevelProId = GetUUID32.getUUID32();
                    policyGradeLevelPro.setPglProductId(policyGradeLevelProId);
                    policyGradeLevelPro.setPolicyNo(tpaPolClientRelationEntity.getPolno());
                    policyGradeLevelPro.setPolicyGradeLevelNo(Integer.valueOf(tpaPolClientRelationEntity.getGradeLevel()));

                    //待定
                    policyGradeLevelPro.setProductId(tpaPolPlanBenefitEntity.get(0).getProductCode());
                    policyGradeLevelPro.setPglProductTotalPrem(1);
                    policyGradeLevelPro.setPglProductBaseCoverage(1);

                    policyGradeLevelPro.setCreatedBy("SystemTest");
                    policyGradeLevelPro.setCreatedTime(date);
                    policyGradeLevelPro.setUpdatedBy("SystemTest");
                    policyGradeLevelPro.setUpdatedTime(date);
                    policyGradeLeveProlMapper.insert(policyGradeLevelPro);
                }
            } catch (Exception e) {
                LOG.info("保存数据库失败");
            }
        }
        LOG.info("PolicyGradeLevelPro success");
    }

}
