package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActHiTaskinstEntity;

public interface ActHiTaskinstEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActHiTaskinstEntity record);

    int insertSelective(ActHiTaskinstEntity record);

    ActHiTaskinstEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActHiTaskinstEntity record);

    int updateByPrimaryKey(ActHiTaskinstEntity record);
}