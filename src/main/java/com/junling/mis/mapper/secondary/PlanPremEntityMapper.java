package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.PlanPremEntity;

public interface PlanPremEntityMapper {
    int insert(PlanPremEntity record);

    int insertSelective(PlanPremEntity record);
}