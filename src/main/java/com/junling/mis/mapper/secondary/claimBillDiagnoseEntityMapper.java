package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimBillDiagnoseEntity;

public interface claimBillDiagnoseEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(claimBillDiagnoseEntity record);

    int insertSelective(claimBillDiagnoseEntity record);

    claimBillDiagnoseEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(claimBillDiagnoseEntity record);

    int updateByPrimaryKey(claimBillDiagnoseEntity record);
}