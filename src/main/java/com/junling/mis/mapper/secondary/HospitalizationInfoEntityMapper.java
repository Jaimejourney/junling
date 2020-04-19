package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.HospitalizationInfoEntity;

public interface HospitalizationInfoEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(HospitalizationInfoEntity record);

    int insertSelective(HospitalizationInfoEntity record);

    HospitalizationInfoEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HospitalizationInfoEntity record);

    int updateByPrimaryKey(HospitalizationInfoEntity record);
}