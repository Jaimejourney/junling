package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActIdUserEntity;

public interface ActIdUserEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActIdUserEntity record);

    int insertSelective(ActIdUserEntity record);

    ActIdUserEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActIdUserEntity record);

    int updateByPrimaryKey(ActIdUserEntity record);
}