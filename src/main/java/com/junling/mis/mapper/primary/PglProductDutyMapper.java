package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.PglProductDuty;

public interface PglProductDutyMapper {
    int deleteByPrimaryKey(String pglProductDutyId);

    int insert(PglProductDuty record);

    int insertSelective(PglProductDuty record);

    PglProductDuty selectByPrimaryKey(String pglProductDutyId);

    int updateByPrimaryKeySelective(PglProductDuty record);

    int updateByPrimaryKey(PglProductDuty record);
}