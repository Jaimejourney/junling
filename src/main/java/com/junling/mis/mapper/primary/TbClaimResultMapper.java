package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbClaimResult;

public interface TbClaimResultMapper {
    int deleteByPrimaryKey(String resultCode);

    int insert(TbClaimResult record);

    int insertSelective(TbClaimResult record);

    TbClaimResult selectByPrimaryKey(String resultCode);

    int updateByPrimaryKeySelective(TbClaimResult record);

    int updateByPrimaryKey(TbClaimResult record);
}