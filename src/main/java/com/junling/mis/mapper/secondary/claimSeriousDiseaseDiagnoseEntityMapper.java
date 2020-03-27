package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimSeriousDiseaseDiagnoseEntity;

public interface claimSeriousDiseaseDiagnoseEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(claimSeriousDiseaseDiagnoseEntity record);

    int insertSelective(claimSeriousDiseaseDiagnoseEntity record);

    claimSeriousDiseaseDiagnoseEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(claimSeriousDiseaseDiagnoseEntity record);

    int updateByPrimaryKey(claimSeriousDiseaseDiagnoseEntity record);
}