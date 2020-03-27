package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.accessTokenEntity;

public interface accessTokenEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(accessTokenEntity record);

    int insertSelective(accessTokenEntity record);

    accessTokenEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(accessTokenEntity record);

    int updateByPrimaryKey(accessTokenEntity record);
}