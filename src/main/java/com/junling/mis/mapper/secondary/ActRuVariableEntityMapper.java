package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActRuVariableEntity;

public interface ActRuVariableEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActRuVariableEntity record);

    int insertSelective(ActRuVariableEntity record);

    ActRuVariableEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActRuVariableEntity record);

    int updateByPrimaryKey(ActRuVariableEntity record);
}