package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimSeriousDiseaseEntity;

public interface ClaimSeriousDiseaseEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClaimSeriousDiseaseEntity record);

    int insertSelective(ClaimSeriousDiseaseEntity record);

    ClaimSeriousDiseaseEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClaimSeriousDiseaseEntity record);

    int updateByPrimaryKey(ClaimSeriousDiseaseEntity record);
}