package com.junling.mis.mapper;

import com.junling.mis.model.claimAccountInfoEntity;

public interface claimAccountInfoEntityMapper {
    int deleteByPrimaryKey(String accountId);

    int insert(claimAccountInfoEntity record);

    int insertSelective(claimAccountInfoEntity record);

    claimAccountInfoEntity selectByPrimaryKey(String accountId);

    int updateByPrimaryKeySelective(claimAccountInfoEntity record);

    int updateByPrimaryKey(claimAccountInfoEntity record);
}