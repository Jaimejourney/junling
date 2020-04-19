package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.DiagnosisInfoEntity;

public interface DiagnosisInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DiagnosisInfoEntity record);

    int insertSelective(DiagnosisInfoEntity record);

    DiagnosisInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DiagnosisInfoEntity record);

    int updateByPrimaryKey(DiagnosisInfoEntity record);
}