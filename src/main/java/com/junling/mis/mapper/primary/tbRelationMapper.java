package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbRelation;

public interface tbRelationMapper {
    int deleteByPrimaryKey(String relationCode);

    int insert(tbRelation record);

    int insertSelective(tbRelation record);

    tbRelation selectByPrimaryKey(String relationCode);

    int updateByPrimaryKeySelective(tbRelation record);

    int updateByPrimaryKey(tbRelation record);
}