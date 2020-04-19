package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActIdPropertyEntity;

public interface ActIdPropertyEntityMapper {
    int deleteByPrimaryKey(String name);

    int insert(ActIdPropertyEntity record);

    int insertSelective(ActIdPropertyEntity record);

    ActIdPropertyEntity selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(ActIdPropertyEntity record);

    int updateByPrimaryKey(ActIdPropertyEntity record);
}