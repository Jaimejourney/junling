package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.UserChannelInfoEntity;

public interface UserChannelInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserChannelInfoEntity record);

    int insertSelective(UserChannelInfoEntity record);

    UserChannelInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserChannelInfoEntity record);

    int updateByPrimaryKey(UserChannelInfoEntity record);
}