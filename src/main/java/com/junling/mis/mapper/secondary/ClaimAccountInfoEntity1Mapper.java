package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimAccountInfoEntity;

public interface ClaimAccountInfoEntity1Mapper {
    int deleteByPrimaryKey(String id);

    int insert(ClaimAccountInfoEntity record);

    int insertSelective(ClaimAccountInfoEntity record);

    ClaimAccountInfoEntity selectByPrimaryKey(String id);

    ClaimAccountInfoEntity selectByDocuno(String docuno);

    int updateByPrimaryKeySelective(ClaimAccountInfoEntity record);

    int updateByPrimaryKey(ClaimAccountInfoEntity record);
}