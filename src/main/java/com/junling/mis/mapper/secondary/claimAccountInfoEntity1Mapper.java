package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimAccountInfoEntity;

public interface claimAccountInfoEntity1Mapper {
    int deleteByPrimaryKey(String id);

    int insert(claimAccountInfoEntity record);

    int insertSelective(claimAccountInfoEntity record);

    claimAccountInfoEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(claimAccountInfoEntity record);

    int updateByPrimaryKey(claimAccountInfoEntity record);
}