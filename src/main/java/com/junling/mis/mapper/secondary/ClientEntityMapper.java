package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClientEntity;

public interface ClientEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClientEntity record);

    int insertSelective(ClientEntity record);

    ClientEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClientEntity record);

    int updateByPrimaryKey(ClientEntity record);
}