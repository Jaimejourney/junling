package com.junling.mis.mapper;

import com.junling.mis.model.pglProductDutyClaimRateEntity;

public interface pglProductDutyClaimRateEntityMapper {
    int deleteByPrimaryKey(String pglpdClaimRateId);

    int insert(pglProductDutyClaimRateEntity record);

    int insertSelective(pglProductDutyClaimRateEntity record);

    pglProductDutyClaimRateEntity selectByPrimaryKey(String pglpdClaimRateId);

    int updateByPrimaryKeySelective(pglProductDutyClaimRateEntity record);

    int updateByPrimaryKey(pglProductDutyClaimRateEntity record);
}