package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.pglProductDutyEntity;

public interface pglProductDutyEntityMapper {
    int deleteByPrimaryKey(String pglProductDutyId);

    int insert(pglProductDutyEntity record);

    int insertSelective(pglProductDutyEntity record);

    pglProductDutyEntity selectByPrimaryKey(String pglProductDutyId);

    int updateByPrimaryKeySelective(pglProductDutyEntity record);

    int updateByPrimaryKey(pglProductDutyEntity record);
}