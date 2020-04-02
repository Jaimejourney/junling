package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbClaimType;

public interface tbClaimTypeMapper {
    int deleteByPrimaryKey(String calaimTypeCode);

    int insert(tbClaimType record);

    int insertSelective(tbClaimType record);

    tbClaimType selectByPrimaryKey(String calaimTypeCode);

    int updateByPrimaryKeySelective(tbClaimType record);

    int updateByPrimaryKey(tbClaimType record);
}