package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.userRoleInfoEntity;

public interface userRoleInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(userRoleInfoEntity record);

    int insertSelective(userRoleInfoEntity record);

    userRoleInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(userRoleInfoEntity record);

    int updateByPrimaryKey(userRoleInfoEntity record);
}