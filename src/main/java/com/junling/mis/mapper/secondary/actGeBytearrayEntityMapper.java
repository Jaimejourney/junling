package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actGeBytearrayEntity;

public interface actGeBytearrayEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actGeBytearrayEntity record);

    int insertSelective(actGeBytearrayEntity record);

    actGeBytearrayEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actGeBytearrayEntity record);

    int updateByPrimaryKeyWithBLOBs(actGeBytearrayEntity record);

    int updateByPrimaryKey(actGeBytearrayEntity record);
}