package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.PglProdSubDuty;

public interface PglProdSubDutyMapper {
    int deleteByPrimaryKey(String pglProductSubDutyId);

    int insert(PglProdSubDuty record);

    int insertSelective(PglProdSubDuty record);

    PglProdSubDuty selectByPrimaryKey(String pglProductSubDutyId);

    int updateByPrimaryKeySelective(PglProdSubDuty record);

    int updateByPrimaryKey(PglProdSubDuty record);
}