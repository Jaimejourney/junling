package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.IdTypeTblEntity;

public interface IdTypeTblEntityMapper {
    int deleteByPrimaryKey(String idType);

    int insert(IdTypeTblEntity record);

    int insertSelective(IdTypeTblEntity record);

    IdTypeTblEntity selectByPrimaryKey(String idType);

    int updateByPrimaryKeySelective(IdTypeTblEntity record);

    int updateByPrimaryKey(IdTypeTblEntity record);
}