package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actReProcdefEntity;

public interface actReProcdefEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actReProcdefEntity record);

    int insertSelective(actReProcdefEntity record);

    actReProcdefEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actReProcdefEntity record);

    int updateByPrimaryKey(actReProcdefEntity record);
}