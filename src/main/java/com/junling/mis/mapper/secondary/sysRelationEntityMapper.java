package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.sysRelationEntity;

public interface sysRelationEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sysRelationEntity record);

    int insertSelective(sysRelationEntity record);

    sysRelationEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(sysRelationEntity record);

    int updateByPrimaryKey(sysRelationEntity record);
}