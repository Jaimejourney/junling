package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimAccEntity;

public interface ClaimAccEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClaimAccEntity record);

    int insertSelective(ClaimAccEntity record);

    ClaimAccEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClaimAccEntity record);

    int updateByPrimaryKey(ClaimAccEntity record);
}