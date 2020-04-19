package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.SysMenuCopyEntity;

public interface SysMenuCopyEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysMenuCopyEntity record);

    int insertSelective(SysMenuCopyEntity record);

    SysMenuCopyEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysMenuCopyEntity record);

    int updateByPrimaryKey(SysMenuCopyEntity record);
}