package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbClaimSourceTypeEntity;

public interface tbClaimSourceTypeEntityMapper {
    int deleteByPrimaryKey(String statusCode);

    int insert(tbClaimSourceTypeEntity record);

    int insertSelective(tbClaimSourceTypeEntity record);

    tbClaimSourceTypeEntity selectByPrimaryKey(String statusCode);

    int updateByPrimaryKeySelective(tbClaimSourceTypeEntity record);

    int updateByPrimaryKey(tbClaimSourceTypeEntity record);
}