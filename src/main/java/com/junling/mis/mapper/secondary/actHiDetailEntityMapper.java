package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actHiDetailEntity;

public interface actHiDetailEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actHiDetailEntity record);

    int insertSelective(actHiDetailEntity record);

    actHiDetailEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actHiDetailEntity record);

    int updateByPrimaryKey(actHiDetailEntity record);
}