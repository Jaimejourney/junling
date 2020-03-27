package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.prescribedetailEntity;

public interface prescribedetailEntityMapper {
    int deleteByPrimaryKey(Long prescribedetailId);

    int insert(prescribedetailEntity record);

    int insertSelective(prescribedetailEntity record);

    prescribedetailEntity selectByPrimaryKey(Long prescribedetailId);

    int updateByPrimaryKeySelective(prescribedetailEntity record);

    int updateByPrimaryKey(prescribedetailEntity record);
}