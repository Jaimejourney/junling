package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.ClaimBillDiagnose;
import com.junling.mis.model.primary.ClaimBillDiagnoseKey;

public interface ClaimBillDiagnoseMapper {
    int deleteByPrimaryKey(ClaimBillDiagnoseKey key);

    int insert(ClaimBillDiagnose record);

    int insertSelective(ClaimBillDiagnose record);

    ClaimBillDiagnose selectByPrimaryKey(ClaimBillDiagnoseKey key);

    int updateByPrimaryKeySelective(ClaimBillDiagnose record);

    int updateByPrimaryKey(ClaimBillDiagnose record);
}