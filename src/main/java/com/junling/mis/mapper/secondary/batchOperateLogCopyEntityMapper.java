package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.batchOperateLogCopyEntity;

public interface batchOperateLogCopyEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(batchOperateLogCopyEntity record);

    int insertSelective(batchOperateLogCopyEntity record);

    batchOperateLogCopyEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(batchOperateLogCopyEntity record);

    int updateByPrimaryKey(batchOperateLogCopyEntity record);
}