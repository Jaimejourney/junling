package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.hospitalEntity;

public interface hospitalEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(hospitalEntity record);

    int insertSelective(hospitalEntity record);

    hospitalEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(hospitalEntity record);

    int updateByPrimaryKey(hospitalEntity record);
}