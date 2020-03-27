package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.batchOperateLogEntity;

public interface batchOperateLogEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(batchOperateLogEntity record);

    int insertSelective(batchOperateLogEntity record);

    batchOperateLogEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(batchOperateLogEntity record);

    int updateByPrimaryKey(batchOperateLogEntity record);
}