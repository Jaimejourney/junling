package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbGender;

public interface TbGenderMapper {
    int deleteByPrimaryKey(String genderCode);

    int insert(TbGender record);

    int insertSelective(TbGender record);

    TbGender selectByPrimaryKey(String genderCode);

    int updateByPrimaryKeySelective(TbGender record);

    int updateByPrimaryKey(TbGender record);
}