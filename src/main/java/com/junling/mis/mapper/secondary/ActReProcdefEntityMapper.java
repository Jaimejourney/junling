package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActReProcdefEntity;

public interface ActReProcdefEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActReProcdefEntity record);

    int insertSelective(ActReProcdefEntity record);

    ActReProcdefEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActReProcdefEntity record);

    int updateByPrimaryKey(ActReProcdefEntity record);
}