package com.junling.mis.mapper;

import com.junling.mis.model.pglProductSubDutyEntity;

public interface pglProductSubDutyEntityMapper {
    int deleteByPrimaryKey(String pglProductSubDutyId);

    int insert(pglProductSubDutyEntity record);

    int insertSelective(pglProductSubDutyEntity record);

    pglProductSubDutyEntity selectByPrimaryKey(String pglProductSubDutyId);

    int updateByPrimaryKeySelective(pglProductSubDutyEntity record);

    int updateByPrimaryKey(pglProductSubDutyEntity record);
}