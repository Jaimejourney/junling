package com.junling.mis.mapper;

import com.junling.mis.model.tbIdTypeEntity;

public interface tbIdTypeEntityMapper {
    int deleteByPrimaryKey(String idTypeCode);

    int insert(tbIdTypeEntity record);

    int insertSelective(tbIdTypeEntity record);

    tbIdTypeEntity selectByPrimaryKey(String idTypeCode);

    int updateByPrimaryKeySelective(tbIdTypeEntity record);

    int updateByPrimaryKey(tbIdTypeEntity record);
}