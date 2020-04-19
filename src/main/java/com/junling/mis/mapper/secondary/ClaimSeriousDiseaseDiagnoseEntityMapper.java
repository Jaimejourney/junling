package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimSeriousDiseaseDiagnoseEntity;

public interface ClaimSeriousDiseaseDiagnoseEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClaimSeriousDiseaseDiagnoseEntity record);

    int insertSelective(ClaimSeriousDiseaseDiagnoseEntity record);

    ClaimSeriousDiseaseDiagnoseEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClaimSeriousDiseaseDiagnoseEntity record);

    int updateByPrimaryKey(ClaimSeriousDiseaseDiagnoseEntity record);
}