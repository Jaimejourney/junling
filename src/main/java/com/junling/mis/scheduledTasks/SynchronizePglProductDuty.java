package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.PglProductDutyMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.PglProductDuty;
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
public class SynchronizePglProductDuty {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizePglProductDuty.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    VisitPersonEntityMapper visitPersonEntityMapper;

    @Autowired
    TpaClientEntityMapper tpaClientEntityMapper;

    @Autowired
    TpaPolClientRelationEntityMapper tpaPolClientRelationEntityMapper;

    @Autowired
    PglProductDutyMapper pglProductDutyMapper;

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
                LOG.info("保存保单计划产品责任表");
                if (pglProductDutyMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno()) != null) {
                    LOG.info("数据" + tpaPolClientRelationEntity.getPolno() + "已存在");
                } else {
                    List<TpaPolPlanBenefitEntity> tpaPolPlanBenefitEntity = tpaPolPlanBenefitEntityMapper.selectByPolNo(tpaPolClientRelationEntity.getPolno());

                    PglProductDuty pglProductDuty = new PglProductDuty();
                    String pglProductDutyId = GetUUID32.getUUID32();
                    pglProductDuty.setPglProductDutyId(pglProductDutyId);
                    pglProductDuty.setPolicyNo(tpaPolClientRelationEntity.getPolno());

                    pglProductDuty.setPolicyGradeLevelNo(Integer.valueOf(tpaPolClientRelationEntity.getGradeLevel()));
                    pglProductDuty.setProductId(tpaPolPlanBenefitEntity.get(0).getProductCode());
                    //待定
                    pglProductDuty.setPglpDutySpecialContract("待加");


                    pglProductDuty.setCreatedBy("SystemTest");
                    pglProductDuty.setCreatedTime(date);
                    pglProductDuty.setUpdatedBy("SystemTest");
                    pglProductDuty.setUpdatedTime(date);
                    pglProductDutyMapper.insert(pglProductDuty);
                }
            } catch (Exception e) {
                LOG.info("保存数据库失败");
            }
        }
        LOG.info("pglProductDuty success");
    }

}
