package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.EveryDataPendingEntity;

public interface EveryDataPendingEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EveryDataPendingEntity record);

    int insertSelective(EveryDataPendingEntity record);

    EveryDataPendingEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EveryDataPendingEntity record);

    int updateByPrimaryKey(EveryDataPendingEntity record);
}