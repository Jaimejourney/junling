package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.userSourceInfoEntity;
import com.junling.mis.model.secondary.userSourceInfoEntityKey;

public interface userSourceInfoEntityMapper {
    int deleteByPrimaryKey(userSourceInfoEntityKey key);

    int insert(userSourceInfoEntity record);

    int insertSelective(userSourceInfoEntity record);

    userSourceInfoEntity selectByPrimaryKey(userSourceInfoEntityKey key);

    int updateByPrimaryKeySelective(userSourceInfoEntity record);

    int updateByPrimaryKey(userSourceInfoEntity record);
}