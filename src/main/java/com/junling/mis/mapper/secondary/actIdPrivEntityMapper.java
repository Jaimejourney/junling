package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actIdPrivEntity;

public interface actIdPrivEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actIdPrivEntity record);

    int insertSelective(actIdPrivEntity record);

    actIdPrivEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actIdPrivEntity record);

    int updateByPrimaryKey(actIdPrivEntity record);
}