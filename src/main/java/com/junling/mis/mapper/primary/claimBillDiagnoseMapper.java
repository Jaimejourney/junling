package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.claimBillDiagnose;
import com.junling.mis.model.primary.claimBillDiagnoseKey;

public interface claimBillDiagnoseMapper {
    int deleteByPrimaryKey(claimBillDiagnoseKey key);

    int insert(claimBillDiagnose record);

    int insertSelective(claimBillDiagnose record);

    claimBillDiagnose selectByPrimaryKey(claimBillDiagnoseKey key);

    int updateByPrimaryKeySelective(claimBillDiagnose record);

    int updateByPrimaryKey(claimBillDiagnose record);
}