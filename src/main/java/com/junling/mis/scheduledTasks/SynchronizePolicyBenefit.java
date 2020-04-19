package com.junling.mis.scheduledTasks;

import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.PolicyBenefitMapper;
import com.junling.mis.mapper.primary.PolicyInfoMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.PolicyBenefit;
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
public class SynchronizePolicyBenefit {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizePolicyBenefit.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    TpaClientEntityMapper tpaClientEntityMapper;

    @Autowired
    TpaPolClientRelationEntityMapper tpaPolClientRelationEntityMapper;

    @Autowired
    PolicyInfoMapper policyInfoMapper;

    @Autowired
    TpaPolPlanBenefitEntityMapper tpaPolPlanBenefitEntityMapper;

    @Autowired
    TpaClientPolInfoEntityMapper tpaClientPolInfoEntityMapper;

    @Autowired
    PolicyBenefitMapper policyBenefitMapper;

    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            TpaClientEntity tpaClientEntity = tpaClientEntityMapper.selectByMainInsuredId(String.valueOf(record.getPersonId()));
            TpaPolClientRelationEntity tpaPolClientRelationEntity = tpaPolClientRelationEntityMapper.selectByInsuredId(Math.toIntExact(tpaClientEntity.getId()));
            TpaPolPlanBenefitEntity tpaPolPlanBenefitEntity = tpaPolPlanBenefitEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());
            TpaClientPolInfoEntity tpaClientPolInfoEntity = tpaClientPolInfoEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());

            PolicyBenefit policyBenefit = new PolicyBenefit();
            String policyBenefitId = GetUUID32.getUUID32();
            policyBenefit.setPolicyBenefitId(policyBenefitId);
            policyBenefit.setPolicyNo(tpaPolClientRelationEntity.getPolno());
            policyBenefit.setPolicyReinsuranceNo(tpaClientPolInfoEntity.getCertno());
            policyBenefit.setProductId(tpaPolPlanBenefitEntity.getProductCode());
            policyBenefit.setDutyId(String.valueOf(tpaPolPlanBenefitEntity.getBenefitCode()));



            policyBenefit.setCreatedBy("SystemTest");
            policyBenefit.setCreatedTime(date);
            policyBenefit.setUpdatedBy("SystemTest");
            policyBenefit.setUpdatedTime(date);
            policyBenefitMapper.insert(policyBenefit);
            System.out.println("policyBenefit success");
        }
    }

}
