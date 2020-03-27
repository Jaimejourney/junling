package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.userInfoEntity;

public interface userInfoEntityMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(userInfoEntity record);

    int insertSelective(userInfoEntity record);

    userInfoEntity selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(userInfoEntity record);

    int updateByPrimaryKey(userInfoEntity record);
}