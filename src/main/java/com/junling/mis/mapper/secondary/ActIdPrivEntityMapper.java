package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActIdPrivEntity;

public interface ActIdPrivEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActIdPrivEntity record);

    int insertSelective(ActIdPrivEntity record);

    ActIdPrivEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActIdPrivEntity record);

    int updateByPrimaryKey(ActIdPrivEntity record);
}