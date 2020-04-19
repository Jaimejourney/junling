package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbRelation;

public interface TbRelationMapper {
    int deleteByPrimaryKey(String relationCode);

    int insert(TbRelation record);

    int insertSelective(TbRelation record);

    TbRelation selectByPrimaryKey(String relationCode);

    int updateByPrimaryKeySelective(TbRelation record);

    int updateByPrimaryKey(TbRelation record);
}