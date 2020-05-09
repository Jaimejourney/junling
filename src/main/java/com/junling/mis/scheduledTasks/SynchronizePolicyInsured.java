package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.PolicyInsuredMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.PolicyInsured;
import com.junling.mis.model.secondary.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Component
public class SynchronizePolicyInsured {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizePolicyInsured.class);

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
    TpaClientPolInfoEntityMapper tpaClientPolInfoEntityMapper;

    @Autowired
    PolicyInsuredMapper policyInsuredMapper;

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
                LOG.info("保存被保人表");
                if (policyInsuredMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno()) != null) {
                    LOG.info("数据" + tpaPolClientRelationEntity.getPolno() + "已存在");
                } else {
                    TpaClientPolInfoEntity tpaClientPolInfoEntity = tpaClientPolInfoEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());

                    PolicyInsured policyInsured = new PolicyInsured();
                    String policyInsuredId = GetUUID32.getUUID32();
                    policyInsured.setPolicyInsuredId(policyInsuredId);
                    policyInsured.setPolicyNo(tpaPolClientRelationEntity.getPolno());
                    policyInsured.setPolicyReinsuranceNo(tpaClientPolInfoEntity.getCertno());
                    policyInsured.setProductId(tpaClientPolInfoEntity.getProductCode());
                    policyInsured.setInsureId(String.valueOf(record.getPersonId()));

                    policyInsured.setCreatedBy("SystemTest");
                    policyInsured.setCreatedTime(date);
                    policyInsured.setUpdatedBy("SystemTest");
                    policyInsured.setUpdatedTime(date);
                    policyInsuredMapper.insert(policyInsured);
                }
            } catch (Exception e) {
                LOG.info("保存数据库失败");
            }
        }
        LOG.info("PolicyInsured success");
    }

}
