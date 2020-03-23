package com.junling.mis.mapper;

import com.junling.mis.model.tbJobEntity;

public interface tbJobEntityMapper {
    int deleteByPrimaryKey(String jobCode);

    int insert(tbJobEntity record);

    int insertSelective(tbJobEntity record);

    tbJobEntity selectByPrimaryKey(String jobCode);

    int updateByPrimaryKeySelective(tbJobEntity record);

    int updateByPrimaryKey(tbJobEntity record);
}