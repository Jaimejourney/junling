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
    TpaClientEntityMapper tpaClientEntityMapper;

    @Autowired
    TpaPolClientRelationEntityMapper tpaPolClientRelationEntityMapper;

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
            TpaPolBeneficiaryEntity tpaPolBeneficiaryEntity = tpaPolBeneficiaryEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());
            TpaPolPlanEntity tpaPolPlanEntity = tpaPolPlanEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());

            PolicyBeneficiary policyBeneficiary = new PolicyBeneficiary();
            String policyBeneficiaryId = GetUUID32.getUUID32();
            policyBeneficiary.setPolicyBeneficiaryId(policyBeneficiaryId);
            policyBeneficiary.setPolicyNo(tpaPolBeneficiaryEntity.getPolno());
            policyBeneficiary.setPolicyReinsuranceNo(tpaClientPolInfoEntity.getCertno());
            //待加
            policyBeneficiary.setBrNo(0);

            policyBeneficiary.setInsureId(tpaPolBeneficiaryEntity.getInsuredId());
            policyBeneficiary.setGradeLevelId(tpaPolPlanEntity.getGradeLevel());
            policyBeneficiary.setProductId(tpaPolPlanEntity.getProductCode());
            policyBeneficiary.setDutyId(String.valueOf(tpaPolPlanBenefitEntity.getBenefitCode()));
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
            System.out.println("policyBeneficiary success");
        }
    }


}
