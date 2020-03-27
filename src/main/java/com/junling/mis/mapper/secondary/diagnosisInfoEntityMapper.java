package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.diagnosisInfoEntity;

public interface diagnosisInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(diagnosisInfoEntity record);

    int insertSelective(diagnosisInfoEntity record);

    diagnosisInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(diagnosisInfoEntity record);

    int updateByPrimaryKey(diagnosisInfoEntity record);
}