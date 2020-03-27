package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbAccidentTypeEntity;

public interface tbAccidentTypeEntityMapper {
    int deleteByPrimaryKey(String accidentTypeCode);

    int insert(tbAccidentTypeEntity record);

    int insertSelective(tbAccidentTypeEntity record);

    tbAccidentTypeEntity selectByPrimaryKey(String accidentTypeCode);

    int updateByPrimaryKeySelective(tbAccidentTypeEntity record);

    int updateByPrimaryKey(tbAccidentTypeEntity record);
}