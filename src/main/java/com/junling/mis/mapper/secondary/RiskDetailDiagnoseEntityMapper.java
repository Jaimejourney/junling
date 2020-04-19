package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.RiskDetailDiagnoseEntity;

public interface RiskDetailDiagnoseEntityMapper {
    int deleteByPrimaryKey(Integer diagnoseid);

    int insert(RiskDetailDiagnoseEntity record);

    int insertSelective(RiskDetailDiagnoseEntity record);

    RiskDetailDiagnoseEntity selectByPrimaryKey(Integer diagnoseid);

    int updateByPrimaryKeySelective(RiskDetailDiagnoseEntity record);

    int updateByPrimaryKey(RiskDetailDiagnoseEntity record);
}