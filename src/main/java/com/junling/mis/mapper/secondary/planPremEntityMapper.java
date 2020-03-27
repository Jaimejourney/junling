package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.planPremEntity;

public interface planPremEntityMapper {
    int insert(planPremEntity record);

    int insertSelective(planPremEntity record);
}