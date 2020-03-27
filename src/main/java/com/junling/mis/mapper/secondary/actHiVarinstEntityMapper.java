package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actHiVarinstEntity;

public interface actHiVarinstEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actHiVarinstEntity record);

    int insertSelective(actHiVarinstEntity record);

    actHiVarinstEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actHiVarinstEntity record);

    int updateByPrimaryKey(actHiVarinstEntity record);
}