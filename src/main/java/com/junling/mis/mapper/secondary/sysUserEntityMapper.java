package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.sysUserEntity;

public interface sysUserEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sysUserEntity record);

    int insertSelective(sysUserEntity record);

    sysUserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(sysUserEntity record);

    int updateByPrimaryKey(sysUserEntity record);
}