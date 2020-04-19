package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbHdRelation;

public interface TbHdRelationMapper {
    int deleteByPrimaryKey(String hospitalDepartmentId);

    int insert(TbHdRelation record);

    int insertSelective(TbHdRelation record);

    TbHdRelation selectByPrimaryKey(String hospitalDepartmentId);

    int updateByPrimaryKeySelective(TbHdRelation record);

    int updateByPrimaryKey(TbHdRelation record);
}