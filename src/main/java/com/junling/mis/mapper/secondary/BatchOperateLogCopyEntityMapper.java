package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.BatchOperateLogCopyEntity;

public interface BatchOperateLogCopyEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(BatchOperateLogCopyEntity record);

    int insertSelective(BatchOperateLogCopyEntity record);

    BatchOperateLogCopyEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BatchOperateLogCopyEntity record);

    int updateByPrimaryKey(BatchOperateLogCopyEntity record);
}