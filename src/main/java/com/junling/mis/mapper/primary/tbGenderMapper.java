package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbGender;

public interface tbGenderMapper {
    int deleteByPrimaryKey(String genderCode);

    int insert(tbGender record);

    int insertSelective(tbGender record);

    tbGender selectByPrimaryKey(String genderCode);

    int updateByPrimaryKeySelective(tbGender record);

    int updateByPrimaryKey(tbGender record);
}