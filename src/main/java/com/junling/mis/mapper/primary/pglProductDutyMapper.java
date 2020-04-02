package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.pglProductDuty;

public interface pglProductDutyMapper {
    int deleteByPrimaryKey(String pglProductDutyId);

    int insert(pglProductDuty record);

    int insertSelective(pglProductDuty record);

    pglProductDuty selectByPrimaryKey(String pglProductDutyId);

    int updateByPrimaryKeySelective(pglProductDuty record);

    int updateByPrimaryKey(pglProductDuty record);
}