package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.PrescribedetailEntity;

public interface PrescribedetailEntityMapper {
    int deleteByPrimaryKey(Long prescribedetailId);

    int insert(PrescribedetailEntity record);

    int insertSelective(PrescribedetailEntity record);

    PrescribedetailEntity selectByPrimaryKey(Long prescribedetailId);

    int updateByPrimaryKeySelective(PrescribedetailEntity record);

    int updateByPrimaryKey(PrescribedetailEntity record);
}