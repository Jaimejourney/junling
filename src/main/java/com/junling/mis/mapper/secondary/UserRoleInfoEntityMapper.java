package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.UserRoleInfoEntity;

public interface UserRoleInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRoleInfoEntity record);

    int insertSelective(UserRoleInfoEntity record);

    UserRoleInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRoleInfoEntity record);

    int updateByPrimaryKey(UserRoleInfoEntity record);
}