package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.funSwitchEntity;

public interface funSwitchEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(funSwitchEntity record);

    int insertSelective(funSwitchEntity record);

    funSwitchEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(funSwitchEntity record);

    int updateByPrimaryKey(funSwitchEntity record);
}