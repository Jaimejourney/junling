package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.SystemLogEntity;
import com.junling.mis.model.secondary.SystemLogEntityWithBLOBs;

public interface SystemLogEntityMapper {
    int deleteByPrimaryKey(Long logId);

    int insert(SystemLogEntityWithBLOBs record);

    int insertSelective(SystemLogEntityWithBLOBs record);

    SystemLogEntityWithBLOBs selectByPrimaryKey(Long logId);

    int updateByPrimaryKeySelective(SystemLogEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SystemLogEntityWithBLOBs record);

    int updateByPrimaryKey(SystemLogEntity record);
}