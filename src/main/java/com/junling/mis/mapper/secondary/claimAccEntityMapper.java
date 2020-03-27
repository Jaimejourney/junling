package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimAccEntity;

public interface claimAccEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(claimAccEntity record);

    int insertSelective(claimAccEntity record);

    claimAccEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(claimAccEntity record);

    int updateByPrimaryKey(claimAccEntity record);
}