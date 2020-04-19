package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.BatchOperateLogEntity;

public interface BatchOperateLogEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(BatchOperateLogEntity record);

    int insertSelective(BatchOperateLogEntity record);

    BatchOperateLogEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BatchOperateLogEntity record);

    int updateByPrimaryKey(BatchOperateLogEntity record);
}