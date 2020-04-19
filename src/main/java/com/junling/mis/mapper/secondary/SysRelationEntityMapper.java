package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.SysRelationEntity;

public interface SysRelationEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRelationEntity record);

    int insertSelective(SysRelationEntity record);

    SysRelationEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRelationEntity record);

    int updateByPrimaryKey(SysRelationEntity record);
}