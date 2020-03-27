package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actRuVariableEntity;

public interface actRuVariableEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actRuVariableEntity record);

    int insertSelective(actRuVariableEntity record);

    actRuVariableEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actRuVariableEntity record);

    int updateByPrimaryKey(actRuVariableEntity record);
}