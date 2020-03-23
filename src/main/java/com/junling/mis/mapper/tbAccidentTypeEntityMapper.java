package com.junling.mis.mapper;

import com.junling.mis.model.tbAccidentTypeEntity;

public interface tbAccidentTypeEntityMapper {
    int deleteByPrimaryKey(String accidentTypeCode);

    int insert(tbAccidentTypeEntity record);

    int insertSelective(tbAccidentTypeEntity record);

    tbAccidentTypeEntity selectByPrimaryKey(String accidentTypeCode);

    int updateByPrimaryKeySelective(tbAccidentTypeEntity record);

    int updateByPrimaryKey(tbAccidentTypeEntity record);
}