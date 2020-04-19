package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActReModelEntity;

public interface ActReModelEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActReModelEntity record);

    int insertSelective(ActReModelEntity record);

    ActReModelEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActReModelEntity record);

    int updateByPrimaryKey(ActReModelEntity record);
}