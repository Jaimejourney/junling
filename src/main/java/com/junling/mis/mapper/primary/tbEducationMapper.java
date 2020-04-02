package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbEducation;

public interface tbEducationMapper {
    int deleteByPrimaryKey(String educationCode);

    int insert(tbEducation record);

    int insertSelective(tbEducation record);

    tbEducation selectByPrimaryKey(String educationCode);

    int updateByPrimaryKeySelective(tbEducation record);

    int updateByPrimaryKey(tbEducation record);
}