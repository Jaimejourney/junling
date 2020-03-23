package com.junling.mis.mapper;

import com.junling.mis.model.pglProductDutyEntity;

public interface pglProductDutyEntityMapper {
    int deleteByPrimaryKey(String pglProductDutyId);

    int insert(pglProductDutyEntity record);

    int insertSelective(pglProductDutyEntity record);

    pglProductDutyEntity selectByPrimaryKey(String pglProductDutyId);

    int updateByPrimaryKeySelective(pglProductDutyEntity record);

    int updateByPrimaryKey(pglProductDutyEntity record);
}