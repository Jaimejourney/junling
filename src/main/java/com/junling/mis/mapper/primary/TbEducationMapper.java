package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbEducation;

public interface TbEducationMapper {
    int deleteByPrimaryKey(String educationCode);

    int insert(TbEducation record);

    int insertSelective(TbEducation record);

    TbEducation selectByPrimaryKey(String educationCode);

    int updateByPrimaryKeySelective(TbEducation record);

    int updateByPrimaryKey(TbEducation record);
}