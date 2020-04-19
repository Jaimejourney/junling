package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.SysOperationLogEntity;
import com.junling.mis.model.secondary.SysOperationLogEntityWithBLOBs;

public interface SysOperationLogEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysOperationLogEntityWithBLOBs record);

    int insertSelective(SysOperationLogEntityWithBLOBs record);

    SysOperationLogEntityWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysOperationLogEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysOperationLogEntityWithBLOBs record);

    int updateByPrimaryKey(SysOperationLogEntity record);
}