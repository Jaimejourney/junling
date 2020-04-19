package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.SysMenuEntity;

public interface SysMenuEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysMenuEntity record);

    int insertSelective(SysMenuEntity record);

    SysMenuEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysMenuEntity record);

    int updateByPrimaryKey(SysMenuEntity record);
}