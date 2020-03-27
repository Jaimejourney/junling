package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbHdRelationEntity;

public interface tbHdRelationEntityMapper {
    int deleteByPrimaryKey(String hospitalDepartmentId);

    int insert(tbHdRelationEntity record);

    int insertSelective(tbHdRelationEntity record);

    tbHdRelationEntity selectByPrimaryKey(String hospitalDepartmentId);

    int updateByPrimaryKeySelective(tbHdRelationEntity record);

    int updateByPrimaryKey(tbHdRelationEntity record);
}