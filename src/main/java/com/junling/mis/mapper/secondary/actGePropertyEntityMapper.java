package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actGePropertyEntity;

public interface actGePropertyEntityMapper {
    int deleteByPrimaryKey(String name);

    int insert(actGePropertyEntity record);

    int insertSelective(actGePropertyEntity record);

    actGePropertyEntity selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(actGePropertyEntity record);

    int updateByPrimaryKey(actGePropertyEntity record);
}