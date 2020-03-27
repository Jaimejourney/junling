package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actHiTaskinstEntity;

public interface actHiTaskinstEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actHiTaskinstEntity record);

    int insertSelective(actHiTaskinstEntity record);

    actHiTaskinstEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actHiTaskinstEntity record);

    int updateByPrimaryKey(actHiTaskinstEntity record);
}