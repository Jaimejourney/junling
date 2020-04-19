package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.SysRoleEntity;

public interface SysRoleEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleEntity record);

    int insertSelective(SysRoleEntity record);

    SysRoleEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleEntity record);

    int updateByPrimaryKey(SysRoleEntity record);
}