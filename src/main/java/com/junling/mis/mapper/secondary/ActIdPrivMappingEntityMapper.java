package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActIdPrivMappingEntity;

public interface ActIdPrivMappingEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActIdPrivMappingEntity record);

    int insertSelective(ActIdPrivMappingEntity record);

    ActIdPrivMappingEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActIdPrivMappingEntity record);

    int updateByPrimaryKey(ActIdPrivMappingEntity record);
}