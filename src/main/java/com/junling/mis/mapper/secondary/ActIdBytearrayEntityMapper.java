package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActIdBytearrayEntity;

public interface ActIdBytearrayEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActIdBytearrayEntity record);

    int insertSelective(ActIdBytearrayEntity record);

    ActIdBytearrayEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActIdBytearrayEntity record);

    int updateByPrimaryKeyWithBLOBs(ActIdBytearrayEntity record);

    int updateByPrimaryKey(ActIdBytearrayEntity record);
}