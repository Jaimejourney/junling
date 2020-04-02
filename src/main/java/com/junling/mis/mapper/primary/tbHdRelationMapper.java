package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbHdRelation;

public interface tbHdRelationMapper {
    int deleteByPrimaryKey(String hospitalDepartmentId);

    int insert(tbHdRelation record);

    int insertSelective(tbHdRelation record);

    tbHdRelation selectByPrimaryKey(String hospitalDepartmentId);

    int updateByPrimaryKeySelective(tbHdRelation record);

    int updateByPrimaryKey(tbHdRelation record);
}