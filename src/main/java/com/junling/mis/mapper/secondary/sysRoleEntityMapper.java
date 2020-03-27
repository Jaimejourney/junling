package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.sysRoleEntity;

public interface sysRoleEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sysRoleEntity record);

    int insertSelective(sysRoleEntity record);

    sysRoleEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(sysRoleEntity record);

    int updateByPrimaryKey(sysRoleEntity record);
}