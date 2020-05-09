package com.junling.mis.scheduledTasks;


import com.junling.mis.common.dateTime.DatetimeHelper;
import com.junling.mis.common.utils.GetUUID32;
import com.junling.mis.mapper.primary.ClaimBillDiagnoseMapper;
import com.junling.mis.mapper.primary.ClaimBillMapper;
import com.junling.mis.mapper.primary.ClaimInfoMapper;
import com.junling.mis.mapper.secondary.ClaimBillDiagnoseEntityMapper;
import com.junling.mis.mapper.secondary.VisitRecordEntityMapper;
import com.junling.mis.mapper.secondary.VisitRecordRenbaojianDetailEntityMapper;
import com.junling.mis.model.primary.ClaimBill;
import com.junling.mis.model.primary.ClaimBillDiagnose;
import com.junling.mis.model.primary.ClaimInfo;
import com.junling.mis.model.secondary.ClaimBillDiagnoseEntity;
import com.junling.mis.model.secondary.VisitRecordEntity;
import com.junling.mis.model.secondary.VisitRecordRenbaojianDetailEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Component
public class SynchronizeClaimBillDiagnose {
    private final static Logger LOG = LoggerFactory.getLogger(SynchronizeClaimBillDiagnose.class);

    @Autowired
    VisitRecordEntityMapper visitRecordEntityMapper;

    @Autowired
    ClaimBillDiagnoseMapper claimBillDiagnoseMapper;

    @Autowired
    ClaimInfoMapper claimInfoMapper;

    @Autowired
    ClaimBillMapper claimBillMapper;

    @Autowired
    VisitRecordRenbaojianDetailEntityMapper visitRecordRenbaojianDetailEntityMapper;

    @Autowired
    ClaimBillDiagnoseEntityMapper claimBillDiagnoseEntityMapper;

    public void myTask(Integer index) throws ParseException {
        Date date = DatetimeHelper.scheduledDate();

        List<VisitRecordEntity> list = visitRecordEntityMapper.search((date));
        VisitRecordEntity visitRecordEntity = visitRecordEntityMapper.selectByPrimaryKey("B3693879301211136");
        list.add(visitRecordEntity);

        for (int i = 0; i < list.size(); i++) {
            VisitRecordEntity record = list.get(i);
            try {
                LOG.info("保存账单疾病表");
                ClaimInfo claimInfo = claimInfoMapper.selectByClaimNo(record.getId());
                List<ClaimBill> listClaimBill = claimBillMapper.selectByClaimInfoId(claimInfo.getClaimInfoId());
                ClaimBill claimBill = listClaimBill.get(index);

                VisitRecordRenbaojianDetailEntity visitRecordRenbaojianDetailEntity = visitRecordRenbaojianDetailEntityMapper.selectByPrimaryKey(record.getId());
                if (claimBillDiagnoseMapper.selectByClaimBillId(claimBill.getClaimBillId()) != null) {
                    LOG.info("数据" + claimBill.getClaimBillId() + "已存在");
                } else {
                    ClaimBillDiagnose claimBillDiagnose = new ClaimBillDiagnose();
                    String claimBillDiagnoseId = GetUUID32.getUUID32();
                    claimBillDiagnose.setClaimBillDiagnoseId(claimBillDiagnoseId);
                    claimBillDiagnose.setClaimInfoId(claimInfo.getClaimInfoId());
                    claimBillDiagnose.setClaimNo(record.getId());
                    claimBillDiagnose.setReportNo(visitRecordRenbaojianDetailEntity.getMaYiCaseNo());
                    claimBillDiagnose.setClaimBillId(claimBill.getClaimBillId());
                    claimBillDiagnose.setClaimBillNo(claimBill.getClaimBillNo());
                    claimBillDiagnose.setDiagnosticCode("待加");
                    claimBillDiagnose.setDocTypeParent("待加");
                    claimBillDiagnose.setCreatedBy("SystemTest");
                    claimBillDiagnose.setCreatedTime(date);
                    claimBillDiagnose.setUpdatedBy("SystemTest");
                    claimBillDiagnose.setUpdatedTime(date);
                    claimBillDiagnoseMapper.insert(claimBillDiagnose);
                }
            } catch (Exception e) {
                LOG.info("保存数据库失败");
            }
        }
        LOG.info("ClaimBillDiagnose success");
    }
}
