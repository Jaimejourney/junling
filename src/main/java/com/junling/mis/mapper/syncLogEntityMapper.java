package com.junling.mis.mapper;

import com.junling.mis.model.syncLogEntity;

public interface syncLogEntityMapper {
    int deleteByPrimaryKey(String tableName);

    int insert(syncLogEntity record);

    int insertSelective(syncLogEntity record);

    syncLogEntity selectByPrimaryKey(String tableName);

    int updateByPrimaryKeySelective(syncLogEntity record);

    int updateByPrimaryKey(syncLogEntity record);
}