package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.HospitalEntity;

public interface HospitalEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HospitalEntity record);

    int insertSelective(HospitalEntity record);

    HospitalEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HospitalEntity record);

    int updateByPrimaryKey(HospitalEntity record);
}