package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.riskDetailDiagnoseEntity;

public interface riskDetailDiagnoseEntityMapper {
    int deleteByPrimaryKey(Integer diagnoseid);

    int insert(riskDetailDiagnoseEntity record);

    int insertSelective(riskDetailDiagnoseEntity record);

    riskDetailDiagnoseEntity selectByPrimaryKey(Integer diagnoseid);

    int updateByPrimaryKeySelective(riskDetailDiagnoseEntity record);

    int updateByPrimaryKey(riskDetailDiagnoseEntity record);
}