package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbClaimResult;

public interface tbClaimResultMapper {
    int deleteByPrimaryKey(String resultCode);

    int insert(tbClaimResult record);

    int insertSelective(tbClaimResult record);

    tbClaimResult selectByPrimaryKey(String resultCode);

    int updateByPrimaryKeySelective(tbClaimResult record);

    int updateByPrimaryKey(tbClaimResult record);
}