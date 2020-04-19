package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActHiVarinstEntity;

public interface ActHiVarinstEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActHiVarinstEntity record);

    int insertSelective(ActHiVarinstEntity record);

    ActHiVarinstEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActHiVarinstEntity record);

    int updateByPrimaryKey(ActHiVarinstEntity record);
}