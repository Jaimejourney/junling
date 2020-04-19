package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.PolRelationTableEntity;

public interface PolRelationTableEntityMapper {
    int deleteByPrimaryKey(String polRelation);

    int insert(PolRelationTableEntity record);

    int insertSelective(PolRelationTableEntity record);

    PolRelationTableEntity selectByPrimaryKey(String polRelation);

    int updateByPrimaryKeySelective(PolRelationTableEntity record);

    int updateByPrimaryKey(PolRelationTableEntity record);
}