package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.sysMenuCopyEntity;

public interface sysMenuCopyEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(sysMenuCopyEntity record);

    int insertSelective(sysMenuCopyEntity record);

    sysMenuCopyEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(sysMenuCopyEntity record);

    int updateByPrimaryKey(sysMenuCopyEntity record);
}