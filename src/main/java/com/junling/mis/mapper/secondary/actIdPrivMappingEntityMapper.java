package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actIdPrivMappingEntity;

public interface actIdPrivMappingEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actIdPrivMappingEntity record);

    int insertSelective(actIdPrivMappingEntity record);

    actIdPrivMappingEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actIdPrivMappingEntity record);

    int updateByPrimaryKey(actIdPrivMappingEntity record);
}