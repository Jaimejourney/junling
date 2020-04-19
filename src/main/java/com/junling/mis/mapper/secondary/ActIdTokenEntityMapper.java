package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActIdTokenEntity;

public interface ActIdTokenEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActIdTokenEntity record);

    int insertSelective(ActIdTokenEntity record);

    ActIdTokenEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActIdTokenEntity record);

    int updateByPrimaryKey(ActIdTokenEntity record);
}