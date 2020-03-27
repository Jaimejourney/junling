package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.polRelationTableEntity;

public interface polRelationTableEntityMapper {
    int deleteByPrimaryKey(String polRelation);

    int insert(polRelationTableEntity record);

    int insertSelective(polRelationTableEntity record);

    polRelationTableEntity selectByPrimaryKey(String polRelation);

    int updateByPrimaryKeySelective(polRelationTableEntity record);

    int updateByPrimaryKey(polRelationTableEntity record);
}