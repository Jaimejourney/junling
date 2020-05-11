package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.mapper.primary.PolicyBeneficiaryMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.PolicyBeneficiary;
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
public class SynchronizePolicyBeneficiary {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizePolicyBeneficiary.class);

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
    TpaPolBeneficiaryEntityMapper tpaPolBeneficiaryEntityMapper;

    @Autowired
    TpaPolMainEntityMapper tpaPolMainEntityMapper;

    @Autowired
    PolicyBeneficiaryMapper policyBeneficiaryMapper;


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
                LOG.info("保存受益人表");
                List<TpaPolPlanBenefitEntity> tpaPolPlanBenefitEntity = tpaPolPlanBenefitEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());
                TpaPolMainEntity tpaPolMainEntity = tpaPolMainEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());
                TpaPolBeneficiaryEntity tpaPolBeneficiaryEntity = tpaPolBeneficiaryEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());

                for (int j = 0; j < tpaPolPlanBenefitEntity.size(); j++) {
                    if (policyBeneficiaryMapper.selectByPrimaryKey(String.valueOf(tpaPolPlanBenefitEntity.get(j).getId())) != null) {
                        LOG.info("数据" + tpaPolPlanBenefitEntity.get(j).getId() + "已存在");
                    } else {
                        PolicyBeneficiary policyBeneficiary = new PolicyBeneficiary();
//                    String policyBeneficiaryId = GetUUID32.getUUID32();
                        policyBeneficiary.setPolicyBeneficiaryId(String.valueOf(tpaPolPlanBenefitEntity.get(j).getId()));
                        policyBeneficiary.setPolicyNo(tpaPolClientRelationEntity.getPolno());

                        //待加
                        policyBeneficiary.setPolicyReinsuranceNo(tpaPolMainEntity.getCertno());
                        policyBeneficiary.setBrNo(0);

                        policyBeneficiary.setInsureId(tpaPolBeneficiaryEntity.getInsuredId());
                        policyBeneficiary.setGradeLevelId(tpaPolClientRelationEntity.getGradeLevel());
                        policyBeneficiary.setProductId(tpaPolPlanBenefitEntity.get(i).getProductCode());
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
                }
            } catch (Exception e) {
                LOG.info("保存数据库失败");
            }
        }
        LOG.info("policyBeneficiary success");
    }


}
