package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.sysMenuEntity;

public interface sysMenuEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(sysMenuEntity record);

    int insertSelective(sysMenuEntity record);

    sysMenuEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(sysMenuEntity record);

    int updateByPrimaryKey(sysMenuEntity record);
}