package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.UserSourceInfoEntity;
import com.junling.mis.model.secondary.UserSourceInfoEntityKey;

public interface UserSourceInfoEntityMapper {
    int deleteByPrimaryKey(UserSourceInfoEntityKey key);

    int insert(UserSourceInfoEntity record);

    int insertSelective(UserSourceInfoEntity record);

    UserSourceInfoEntity selectByPrimaryKey(UserSourceInfoEntityKey key);

    int updateByPrimaryKeySelective(UserSourceInfoEntity record);

    int updateByPrimaryKey(UserSourceInfoEntity record);
}