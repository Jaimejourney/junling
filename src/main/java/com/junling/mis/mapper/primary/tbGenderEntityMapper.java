package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbGenderEntity;

public interface tbGenderEntityMapper {
    int deleteByPrimaryKey(String genderCode);

    int insert(tbGenderEntity record);

    int insertSelective(tbGenderEntity record);

    tbGenderEntity selectByPrimaryKey(String genderCode);

    int updateByPrimaryKeySelective(tbGenderEntity record);

    int updateByPrimaryKey(tbGenderEntity record);
}