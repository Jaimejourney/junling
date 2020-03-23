package com.junling.mis.mapper;

import com.junling.mis.model.tbRelationEntity;

public interface tbRelationEntityMapper {
    int deleteByPrimaryKey(String relationCode);

    int insert(tbRelationEntity record);

    int insertSelective(tbRelationEntity record);

    tbRelationEntity selectByPrimaryKey(String relationCode);

    int updateByPrimaryKeySelective(tbRelationEntity record);

    int updateByPrimaryKey(tbRelationEntity record);
}