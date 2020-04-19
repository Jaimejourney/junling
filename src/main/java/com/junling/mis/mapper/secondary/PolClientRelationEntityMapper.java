package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.PolClientRelationEntity;

public interface PolClientRelationEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(PolClientRelationEntity record);

    int insertSelective(PolClientRelationEntity record);

    PolClientRelationEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PolClientRelationEntity record);

    int updateByPrimaryKey(PolClientRelationEntity record);
}