package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.BenefitEntity;

public interface BenefitEntityMapper {
    int deleteByPrimaryKey(String benefitCode);

    int insert(BenefitEntity record);

    int insertSelective(BenefitEntity record);

    BenefitEntity selectByPrimaryKey(String benefitCode);

    int updateByPrimaryKeySelective(BenefitEntity record);

    int updateByPrimaryKey(BenefitEntity record);
}