package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.RiskDetailEntity;

public interface RiskDetailEntityMapper {
    int deleteByPrimaryKey(Integer riskdetailid);

    int insert(RiskDetailEntity record);

    int insertSelective(RiskDetailEntity record);

    RiskDetailEntity selectByPrimaryKey(Integer riskdetailid);

    int updateByPrimaryKeySelective(RiskDetailEntity record);

    int updateByPrimaryKey(RiskDetailEntity record);
}