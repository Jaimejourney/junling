package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.UserInfoEntity;

public interface UserInfoEntityMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfoEntity record);

    int insertSelective(UserInfoEntity record);

    UserInfoEntity selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserInfoEntity record);

    int updateByPrimaryKey(UserInfoEntity record);
}