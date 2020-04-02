package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbAccidentType;

public interface tbAccidentTypeMapper {
    int deleteByPrimaryKey(String accidentTypeCode);

    int insert(tbAccidentType record);

    int insertSelective(tbAccidentType record);

    tbAccidentType selectByPrimaryKey(String accidentTypeCode);

    int updateByPrimaryKeySelective(tbAccidentType record);

    int updateByPrimaryKey(tbAccidentType record);
}