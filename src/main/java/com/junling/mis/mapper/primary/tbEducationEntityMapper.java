package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbEducationEntity;

public interface tbEducationEntityMapper {
    int deleteByPrimaryKey(String educationCode);

    int insert(tbEducationEntity record);

    int insertSelective(tbEducationEntity record);

    tbEducationEntity selectByPrimaryKey(String educationCode);

    int updateByPrimaryKeySelective(tbEducationEntity record);

    int updateByPrimaryKey(tbEducationEntity record);
}