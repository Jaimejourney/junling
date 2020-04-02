package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.pglProdSubDuty;

public interface pglProdSubDutyMapper {
    int deleteByPrimaryKey(String pglProductSubDutyId);

    int insert(pglProdSubDuty record);

    int insertSelective(pglProdSubDuty record);

    pglProdSubDuty selectByPrimaryKey(String pglProductSubDutyId);

    int updateByPrimaryKeySelective(pglProdSubDuty record);

    int updateByPrimaryKey(pglProdSubDuty record);
}