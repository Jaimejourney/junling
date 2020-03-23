package com.junling.mis.mapper;

import com.junling.mis.model.tbClaimStatusEntity;

public interface tbClaimStatusEntityMapper {
    int deleteByPrimaryKey(String statusCode);

    int insert(tbClaimStatusEntity record);

    int insertSelective(tbClaimStatusEntity record);

    tbClaimStatusEntity selectByPrimaryKey(String statusCode);

    int updateByPrimaryKeySelective(tbClaimStatusEntity record);

    int updateByPrimaryKey(tbClaimStatusEntity record);
}