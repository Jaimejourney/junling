package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActGePropertyEntity;

public interface ActGePropertyEntityMapper {
    int deleteByPrimaryKey(String name);

    int insert(ActGePropertyEntity record);

    int insertSelective(ActGePropertyEntity record);

    ActGePropertyEntity selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(ActGePropertyEntity record);

    int updateByPrimaryKey(ActGePropertyEntity record);
}