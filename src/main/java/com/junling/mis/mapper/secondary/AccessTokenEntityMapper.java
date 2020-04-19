package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.AccessTokenEntity;

public interface AccessTokenEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(AccessTokenEntity record);

    int insertSelective(AccessTokenEntity record);

    AccessTokenEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AccessTokenEntity record);

    int updateByPrimaryKey(AccessTokenEntity record);
}