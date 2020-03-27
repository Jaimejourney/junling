package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.polClientRelationEntity;

public interface polClientRelationEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(polClientRelationEntity record);

    int insertSelective(polClientRelationEntity record);

    polClientRelationEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(polClientRelationEntity record);

    int updateByPrimaryKey(polClientRelationEntity record);
}