package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActHiDetailEntity;

public interface ActHiDetailEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActHiDetailEntity record);

    int insertSelective(ActHiDetailEntity record);

    ActHiDetailEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActHiDetailEntity record);

    int updateByPrimaryKey(ActHiDetailEntity record);
}