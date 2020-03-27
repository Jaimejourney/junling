package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.systemLogCopyEntityWithBLOBs;

public interface systemLogCopyEntityMapper {
    int insert(systemLogCopyEntityWithBLOBs record);

    int insertSelective(systemLogCopyEntityWithBLOBs record);
}