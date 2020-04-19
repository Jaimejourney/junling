package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimBillDiagnoseEntity;

public interface ClaimBillDiagnoseEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClaimBillDiagnoseEntity record);

    int insertSelective(ClaimBillDiagnoseEntity record);

    ClaimBillDiagnoseEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClaimBillDiagnoseEntity record);

    int updateByPrimaryKey(ClaimBillDiagnoseEntity record);
}