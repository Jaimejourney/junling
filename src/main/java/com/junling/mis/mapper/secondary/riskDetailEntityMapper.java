package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.riskDetailEntity;

public interface riskDetailEntityMapper {
    int deleteByPrimaryKey(Integer riskdetailid);

    int insert(riskDetailEntity record);

    int insertSelective(riskDetailEntity record);

    riskDetailEntity selectByPrimaryKey(Integer riskdetailid);

    int updateByPrimaryKeySelective(riskDetailEntity record);

    int updateByPrimaryKey(riskDetailEntity record);
}