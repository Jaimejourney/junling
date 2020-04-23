package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.PolicyBeneficiaryMapper;
import com.junling.mis.mapper.primary.PolicyInfoMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.PolicyBeneficiary;
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
public class SynchronizePolicyBeneficiary {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizePolicyBeneficiary.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    PolicyInfoMapper policyInfoMapper;

    @Autowired
    TpaPolPlanBenefitEntityMapper tpaPolPlanBenefitEntityMapper;

    @Autowired
    TpaPolBeneficiaryEntityMapper tpaPolBeneficiaryEntityMapper;

    @Autowired
    TpaClientPolInfoEntityMapper tpaClientPolInfoEntityMapper;

    @Autowired
    TpaPolPlanEntityMapper tpaPolPlanEntityMapper;

    @Autowired
    PolicyBeneficiaryMapper policyBeneficiaryMapper;


//    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            try {
                LOG.info("保存受益人表");
                List<TpaPolPlanBenefitEntity> tpaPolPlanBenefitEntity = tpaPolPlanBenefitEntityMapper.selectByPolNo(record.getClientPolIds());
                TpaClientPolInfoEntity tpaClientPolInfoEntity = tpaClientPolInfoEntityMapper.selectByPolNo(record.getClientPolIds());
                TpaPolBeneficiaryEntity tpaPolBeneficiaryEntity = tpaPolBeneficiaryEntityMapper.selectByPolNo(record.getClientPolIds());
                TpaPolPlanEntity tpaPolPlanEntity = tpaPolPlanEntityMapper.selectByPolNo(record.getClientPolIds());

                for (int j = 0; j < tpaPolPlanBenefitEntity.size(); j++) {
                    PolicyBeneficiary policyBeneficiary = new PolicyBeneficiary();
                    String policyBeneficiaryId = GetUUID32.getUUID32();
                    policyBeneficiary.setPolicyBeneficiaryId(policyBeneficiaryId);
                    policyBeneficiary.setPolicyNo(record.getClientPolIds());
                    policyBeneficiary.setPolicyReinsuranceNo(tpaClientPolInfoEntity.getCertno());
                    //待加
                    policyBeneficiary.setBrNo(0);

                    policyBeneficiary.setInsureId(tpaPolBeneficiaryEntity.getInsuredId());
                    policyBeneficiary.setGradeLevelId(tpaPolPlanEntity.getGradeLevel());
                    policyBeneficiary.setProductId(tpaPolPlanEntity.getProductCode());
                    policyBeneficiary.setDutyId(String.valueOf(tpaPolPlanBenefitEntity.get(i).getBenefitCode()));
                    policyBeneficiary.setPolicyBeneficiaryType(tpaPolBeneficiaryEntity.getBeneficiaryType());
                    policyBeneficiary.setPolicyBeneficiaryRate(Integer.valueOf(tpaPolBeneficiaryEntity.getBeneficiaryRate()));

                    //待定
                    policyBeneficiary.setPolicyBeneficiaryOrder(tpaPolBeneficiaryEntity.getIsLegalBeneficiary());

                    policyBeneficiary.setInsureRelation(tpaPolBeneficiaryEntity.getPolRelation());
                    policyBeneficiary.setCustomerId(tpaPolBeneficiaryEntity.getInsuredId());


                    policyBeneficiary.setCreatedBy("SystemTest");
                    policyBeneficiary.setCreatedTime(date);
                    policyBeneficiary.setUpdatedBy("SystemTest");
                    policyBeneficiary.setUpdatedTime(date);
                    policyBeneficiaryMapper.insert(policyBeneficiary);
                }
            } catch (Exception e) {
                LOG.info("保存数据库失败");
            }
        }
        System.out.println("policyBeneficiary success");
    }


}
