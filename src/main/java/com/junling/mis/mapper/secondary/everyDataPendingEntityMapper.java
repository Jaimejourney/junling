package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.everyDataPendingEntity;

public interface everyDataPendingEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(everyDataPendingEntity record);

    int insertSelective(everyDataPendingEntity record);

    everyDataPendingEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(everyDataPendingEntity record);

    int updateByPrimaryKey(everyDataPendingEntity record);
}