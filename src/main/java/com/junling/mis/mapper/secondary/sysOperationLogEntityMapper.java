package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.sysOperationLogEntity;
import com.junling.mis.model.secondary.sysOperationLogEntityWithBLOBs;

public interface sysOperationLogEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sysOperationLogEntityWithBLOBs record);

    int insertSelective(sysOperationLogEntityWithBLOBs record);

    sysOperationLogEntityWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(sysOperationLogEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(sysOperationLogEntityWithBLOBs record);

    int updateByPrimaryKey(sysOperationLogEntity record);
}