package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.sysLoginLogEntity;

public interface sysLoginLogEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sysLoginLogEntity record);

    int insertSelective(sysLoginLogEntity record);

    sysLoginLogEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(sysLoginLogEntity record);

    int updateByPrimaryKeyWithBLOBs(sysLoginLogEntity record);

    int updateByPrimaryKey(sysLoginLogEntity record);
}