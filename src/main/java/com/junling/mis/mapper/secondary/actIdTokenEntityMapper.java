package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actIdTokenEntity;

public interface actIdTokenEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actIdTokenEntity record);

    int insertSelective(actIdTokenEntity record);

    actIdTokenEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actIdTokenEntity record);

    int updateByPrimaryKey(actIdTokenEntity record);
}