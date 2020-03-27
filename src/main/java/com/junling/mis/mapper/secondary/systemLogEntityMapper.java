package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.systemLogEntity;
import com.junling.mis.model.secondary.systemLogEntityWithBLOBs;

public interface systemLogEntityMapper {
    int deleteByPrimaryKey(Long logId);

    int insert(systemLogEntityWithBLOBs record);

    int insertSelective(systemLogEntityWithBLOBs record);

    systemLogEntityWithBLOBs selectByPrimaryKey(Long logId);

    int updateByPrimaryKeySelective(systemLogEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(systemLogEntityWithBLOBs record);

    int updateByPrimaryKey(systemLogEntity record);
}