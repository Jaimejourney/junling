package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbJobEntity;

public interface tbJobEntityMapper {
    int deleteByPrimaryKey(String jobCode);

    int insert(tbJobEntity record);

    int insertSelective(tbJobEntity record);

    tbJobEntity selectByPrimaryKey(String jobCode);

    int updateByPrimaryKeySelective(tbJobEntity record);

    int updateByPrimaryKey(tbJobEntity record);
}