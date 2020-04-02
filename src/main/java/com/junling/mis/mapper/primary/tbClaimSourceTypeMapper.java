package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbClaimSourceType;

public interface tbClaimSourceTypeMapper {
    int deleteByPrimaryKey(String statusCode);

    int insert(tbClaimSourceType record);

    int insertSelective(tbClaimSourceType record);

    tbClaimSourceType selectByPrimaryKey(String statusCode);

    int updateByPrimaryKeySelective(tbClaimSourceType record);

    int updateByPrimaryKey(tbClaimSourceType record);
}