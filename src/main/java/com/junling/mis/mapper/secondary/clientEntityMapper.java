package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.clientEntity;

public interface clientEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(clientEntity record);

    int insertSelective(clientEntity record);

    clientEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(clientEntity record);

    int updateByPrimaryKey(clientEntity record);
}