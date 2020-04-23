package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.PglProductDutyMapper;
import com.junling.mis.mapper.primary.PolicyBeneficiaryMapper;
import com.junling.mis.mapper.secondary.*;
import com.junling.mis.model.primary.PglProductDuty;
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
public class SynchronizePglProductDuty {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizePglProductDuty.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    TpaPolBeneficiaryEntityMapper tpaPolBeneficiaryEntityMapper;

    @Autowired
    TpaClientPolInfoEntityMapper tpaClientPolInfoEntityMapper;

    @Autowired
    PolicyBeneficiaryMapper policyBeneficiaryMapper;

    @Autowired
    TpaPolGradeLevelEntityMapper tpaPolGradeLevelEntityMapper;

    @Autowired
    PglProductDutyMapper pglProductDutyMapper;


//    @Scheduled(cron = "0 0 */24 * * *")
    public void myTask() throws ParseException {
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            try {
                LOG.info("保存保单计划产品责任表");
                if (pglProductDutyMapper.selectByPolNo(record.getClientPolIds()) != null) {
                    LOG.info("数据已存在");
                } else {
                    TpaPolBeneficiaryEntity tpaPolBeneficiaryEntity = tpaPolBeneficiaryEntityMapper.selectByPolNo(record.getClientPolIds());
                    TpaPolGradeLevelEntity tpaPolGradeLevelEntity = tpaPolGradeLevelEntityMapper.selectByPolNo(record.getClientPolIds());
                    TpaClientPolInfoEntity tpaClientPolInfoEntity = tpaClientPolInfoEntityMapper.selectByPolNo(record.getClientPolIds());

                    PglProductDuty pglProductDuty = new PglProductDuty();
                    String pglProductDutyId = GetUUID32.getUUID32();
                    pglProductDuty.setPglProductDutyId(pglProductDutyId);
                    pglProductDuty.setPolicyNo(tpaPolBeneficiaryEntity.getPolno());
                    pglProductDuty.setPolicyGradeLevelNo(Integer.valueOf(tpaPolGradeLevelEntity.getGradeLevel()));
                    pglProductDuty.setProductId(tpaClientPolInfoEntity.getProductCode());
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
        System.out.println("pglProductDuty success");
    }

}
