package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbClaimType;

public interface TbClaimTypeMapper {
    int deleteByPrimaryKey(String calaimTypeCode);

    int insert(TbClaimType record);

    int insertSelective(TbClaimType record);

    TbClaimType selectByPrimaryKey(String calaimTypeCode);

    int updateByPrimaryKeySelective(TbClaimType record);

    int updateByPrimaryKey(TbClaimType record);
}