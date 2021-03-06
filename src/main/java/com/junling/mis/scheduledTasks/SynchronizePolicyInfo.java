package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.PolicyInfoMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.PolicyInfo;
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
public class SynchronizePolicyInfo {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizePolicyInfo.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    VisitPersonEntityMapper visitPersonEntityMapper;

    @Autowired
    TpaClientEntityMapper tpaClientEntityMapper;

    @Autowired
    TpaPolClientRelationEntityMapper tpaPolClientRelationEntityMapper;

    @Autowired
    TpaPolMainEntityMapper tpaPolMainEntityMapper;

    @Autowired
    PolicyInfoMapper policyInfoMapper;

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
                if (policyInfoMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno()) != null) {
                    LOG.info("数据" + tpaPolClientRelationEntity.getPolno() + "已存在");
                } else {
                    TpaPolMainEntity tpaPolMainEntity = tpaPolMainEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());
                    List<TpaPolPlanBenefitEntity> tpaPolPlanBenefitEntity = tpaPolPlanBenefitEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());


                    LOG.info("保存保单表");
                    PolicyInfo policyInfo = new PolicyInfo();
                    String policyInfoId = GetUUID32.getUUID32();
                    policyInfo.setPolicyInfoId(policyInfoId);
                    policyInfo.setPolicyNo(tpaPolClientRelationEntity.getPolno());
                    policyInfo.setProductId(tpaPolPlanBenefitEntity.get(0).getProductCode());
                    policyInfo.setPolicyOrganization(record.getPartner());
                    if (tpaPolMainEntity.getOldPolno() != null) {
                        //是续保
                        policyInfo.setIsRenew("1");
                        policyInfo.setRenewPolicyNo(tpaPolMainEntity.getOldPolno());
                    } else {
                        //不是续保
                        policyInfo.setIsRenew("0");
                        policyInfo.setRenewPolicyNo("无");
                    }

                    policyInfo.setPolicyPayType("待加");
                    policyInfo.setCreatedBy("SystemTest");
                    policyInfo.setCreatedTime(date);
                    policyInfo.setUpdatedBy("SystemTest");
                    policyInfo.setUpdatedTime(date);
                    policyInfoMapper.insert(policyInfo);
                }
            } catch (Exception e) {
                LOG.info("保存数据库异常");
            }
        }
        LOG.info("policyInfo success");
    }

}
