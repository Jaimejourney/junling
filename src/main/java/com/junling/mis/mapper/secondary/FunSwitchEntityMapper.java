package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.FunSwitchEntity;

public interface FunSwitchEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FunSwitchEntity record);

    int insertSelective(FunSwitchEntity record);

    FunSwitchEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FunSwitchEntity record);

    int updateByPrimaryKey(FunSwitchEntity record);
}