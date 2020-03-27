package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.userChannelInfoEntity;

public interface userChannelInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(userChannelInfoEntity record);

    int insertSelective(userChannelInfoEntity record);

    userChannelInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(userChannelInfoEntity record);

    int updateByPrimaryKey(userChannelInfoEntity record);
}