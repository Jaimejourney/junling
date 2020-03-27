package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.benefitEntity;

public interface benefitEntityMapper {
    int deleteByPrimaryKey(String benefitCode);

    int insert(benefitEntity record);

    int insertSelective(benefitEntity record);

    benefitEntity selectByPrimaryKey(String benefitCode);

    int updateByPrimaryKeySelective(benefitEntity record);

    int updateByPrimaryKey(benefitEntity record);
}