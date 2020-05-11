package com.junling.mis.scheduledTasks;

import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.mapper.primary.PolicyBenefitMapper;
import com.junling.mis.mapper.primary.PolicyInfoMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.PolicyBenefit;
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
public class SynchronizePolicyBenefit {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizePolicyBenefit.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    VisitPersonEntityMapper visitPersonEntityMapper;

    @Autowired
    TpaClientEntityMapper tpaClientEntityMapper;

    @Autowired
    TpaPolClientRelationEntityMapper tpaPolClientRelationEntityMapper;

    @Autowired
    TpaPolPlanBenefitEntityMapper tpaPolPlanBenefitEntityMapper;

    @Autowired
    TpaPolMainEntityMapper tpaPolMainEntityMapper;

    @Autowired
    PolicyBenefitMapper policyBenefitMapper;

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
                LOG.info("保存保益表");
                List<TpaPolPlanBenefitEntity> tpaPolPlanBenefitEntity = tpaPolPlanBenefitEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());
                TpaPolMainEntity tpaPolMainEntity = tpaPolMainEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());

                for (int j = 0; j < tpaPolPlanBenefitEntity.size(); j++) {
                    if (policyBenefitMapper.selectByPrimaryKey(String.valueOf(tpaPolPlanBenefitEntity.get(j).getId())) != null) {
                        LOG.info("数据" + tpaPolPlanBenefitEntity.get(j).getId() + "已存在");
                    } else {
                        PolicyBenefit policyBenefit = new PolicyBenefit();
//                        String policyBenefitId = GetUUID32.getUUID32();
                        policyBenefit.setPolicyBenefitId(String.valueOf(tpaPolPlanBenefitEntity.get(j).getId()));
                        policyBenefit.setPolicyNo(tpaPolClientRelationEntity.getPolno());
                        policyBenefit.setPolicyReinsuranceNo(tpaPolMainEntity.getCertno());
                        policyBenefit.setProductId(tpaPolPlanBenefitEntity.get(i).getProductCode());
                        policyBenefit.setDutyId(String.valueOf(tpaPolPlanBenefitEntity.get(i).getBenefitCode()));

                        policyBenefit.setCreatedBy("SystemTest");
                        policyBenefit.setCreatedTime(date);
                        policyBenefit.setUpdatedBy("SystemTest");
                        policyBenefit.setUpdatedTime(date);
                        policyBenefitMapper.insert(policyBenefit);
                    }

                }
            } catch (Exception e) {
                LOG.info("保存数据库失败");
            }
        }
        LOG.info("policyBenefit success");
    }

}
