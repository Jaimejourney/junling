package com.junling.mis.mapper;

import com.junling.mis.model.tbGenderEntity;

public interface tbGenderEntityMapper {
    int deleteByPrimaryKey(String genderCode);

    int insert(tbGenderEntity record);

    int insertSelective(tbGenderEntity record);

    tbGenderEntity selectByPrimaryKey(String genderCode);

    int updateByPrimaryKeySelective(tbGenderEntity record);

    int updateByPrimaryKey(tbGenderEntity record);
}