package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.SysLoginLogEntity;

public interface SysLoginLogEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysLoginLogEntity record);

    int insertSelective(SysLoginLogEntity record);

    SysLoginLogEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysLoginLogEntity record);

    int updateByPrimaryKeyWithBLOBs(SysLoginLogEntity record);

    int updateByPrimaryKey(SysLoginLogEntity record);
}