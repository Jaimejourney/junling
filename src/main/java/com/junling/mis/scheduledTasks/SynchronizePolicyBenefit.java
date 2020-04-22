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
            try {
                LOG.info("保存保益表");
                List<TpaPolPlanBenefitEntity> tpaPolPlanBenefitEntity = tpaPolPlanBenefitEntityMapper.selectByPolNo(record.getClientPolIds());
                TpaClientPolInfoEntity tpaClientPolInfoEntity = tpaClientPolInfoEntityMapper.selectByPolNo(record.getClientPolIds());

                for (int j = 0; j < tpaPolPlanBenefitEntity.size(); j++) {
                    PolicyBenefit policyBenefit = new PolicyBenefit();
                    String policyBenefitId = GetUUID32.getUUID32();
                    policyBenefit.setPolicyBenefitId(policyBenefitId);
                    policyBenefit.setPolicyNo(record.getClientPolIds());
                    policyBenefit.setPolicyReinsuranceNo(tpaClientPolInfoEntity.getCertno());
                    policyBenefit.setProductId(tpaPolPlanBenefitEntity.get(i).getProductCode());
                    policyBenefit.setDutyId(String.valueOf(tpaPolPlanBenefitEntity.get(i).getBenefitCode()));

                    policyBenefit.setCreatedBy("SystemTest");
                    policyBenefit.setCreatedTime(date);
                    policyBenefit.setUpdatedBy("SystemTest");
                    policyBenefit.setUpdatedTime(date);
                    policyBenefitMapper.insert(policyBenefit);
                }
            } catch (Exception e) {
                LOG.info("保存数据库失败");
            }
        }
        System.out.println("policyBenefit success");
    }

}
