package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbClaimSourceType;

public interface TbClaimSourceTypeMapper {
    int deleteByPrimaryKey(String statusCode);

    int insert(TbClaimSourceType record);

    int insertSelective(TbClaimSourceType record);

    TbClaimSourceType selectByPrimaryKey(String statusCode);

    int updateByPrimaryKeySelective(TbClaimSourceType record);

    int updateByPrimaryKey(TbClaimSourceType record);
}