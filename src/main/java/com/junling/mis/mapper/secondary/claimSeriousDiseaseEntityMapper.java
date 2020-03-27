package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimSeriousDiseaseEntity;

public interface claimSeriousDiseaseEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(claimSeriousDiseaseEntity record);

    int insertSelective(claimSeriousDiseaseEntity record);

    claimSeriousDiseaseEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(claimSeriousDiseaseEntity record);

    int updateByPrimaryKey(claimSeriousDiseaseEntity record);
}