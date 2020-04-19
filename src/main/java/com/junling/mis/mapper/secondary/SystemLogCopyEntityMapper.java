package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.SystemLogCopyEntityWithBLOBs;

public interface SystemLogCopyEntityMapper {
    int insert(SystemLogCopyEntityWithBLOBs record);

    int insertSelective(SystemLogCopyEntityWithBLOBs record);
}