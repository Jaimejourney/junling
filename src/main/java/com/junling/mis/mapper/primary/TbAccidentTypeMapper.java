package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbAccidentType;

public interface TbAccidentTypeMapper {
    int deleteByPrimaryKey(String accidentTypeCode);

    int insert(TbAccidentType record);

    int insertSelective(TbAccidentType record);

    TbAccidentType selectByPrimaryKey(String accidentTypeCode);

    int updateByPrimaryKeySelective(TbAccidentType record);

    int updateByPrimaryKey(TbAccidentType record);
}