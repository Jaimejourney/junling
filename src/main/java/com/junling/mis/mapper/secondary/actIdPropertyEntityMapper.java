package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actIdPropertyEntity;

public interface actIdPropertyEntityMapper {
    int deleteByPrimaryKey(String name);

    int insert(actIdPropertyEntity record);

    int insertSelective(actIdPropertyEntity record);

    actIdPropertyEntity selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(actIdPropertyEntity record);

    int updateByPrimaryKey(actIdPropertyEntity record);
}