package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbClaimResultEntity;

public interface tbClaimResultEntityMapper {
    int deleteByPrimaryKey(String resultCode);

    int insert(tbClaimResultEntity record);

    int insertSelective(tbClaimResultEntity record);

    tbClaimResultEntity selectByPrimaryKey(String resultCode);

    int updateByPrimaryKeySelective(tbClaimResultEntity record);

    int updateByPrimaryKey(tbClaimResultEntity record);
}