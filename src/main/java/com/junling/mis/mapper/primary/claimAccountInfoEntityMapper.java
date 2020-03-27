package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.claimAccountInfoEntity;

public interface claimAccountInfoEntityMapper {
    int deleteByPrimaryKey(String accountId);

    int insert(claimAccountInfoEntity record);

    int insertSelective(claimAccountInfoEntity record);

    claimAccountInfoEntity selectByPrimaryKey(String accountId);

    int updateByPrimaryKeySelective(claimAccountInfoEntity record);

    int updateByPrimaryKey(claimAccountInfoEntity record);
}