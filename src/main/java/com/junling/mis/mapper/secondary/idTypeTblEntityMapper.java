package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.idTypeTblEntity;

public interface idTypeTblEntityMapper {
    int deleteByPrimaryKey(String idType);

    int insert(idTypeTblEntity record);

    int insertSelective(idTypeTblEntity record);

    idTypeTblEntity selectByPrimaryKey(String idType);

    int updateByPrimaryKeySelective(idTypeTblEntity record);

    int updateByPrimaryKey(idTypeTblEntity record);
}