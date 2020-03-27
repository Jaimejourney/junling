package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.tpaPolBeneficiaryEntity;

public interface tpaPolBeneficiaryEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tpaPolBeneficiaryEntity record);

    int insertSelective(tpaPolBeneficiaryEntity record);

    tpaPolBeneficiaryEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tpaPolBeneficiaryEntity record);

    int updateByPrimaryKey(tpaPolBeneficiaryEntity record);
}