package com.junling.mis.mapper;

import com.junling.mis.model.pglProductSubDutyClaimRateEntity;

public interface pglProductSubDutyClaimRateEntityMapper {
    int deleteByPrimaryKey(String pglpsdClaimRateId);

    int insert(pglProductSubDutyClaimRateEntity record);

    int insertSelective(pglProductSubDutyClaimRateEntity record);

    pglProductSubDutyClaimRateEntity selectByPrimaryKey(String pglpsdClaimRateId);

    int updateByPrimaryKeySelective(pglProductSubDutyClaimRateEntity record);

    int updateByPrimaryKey(pglProductSubDutyClaimRateEntity record);
}