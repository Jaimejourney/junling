package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.TpaPolBeneficiaryEntity;

public interface TpaPolBeneficiaryEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TpaPolBeneficiaryEntity record);

    int insertSelective(TpaPolBeneficiaryEntity record);

    TpaPolBeneficiaryEntity selectByPrimaryKey(Integer id);

    TpaPolBeneficiaryEntity selectByPolNo(String polNo);

    int updateByPrimaryKeySelective(TpaPolBeneficiaryEntity record);

    int updateByPrimaryKey(TpaPolBeneficiaryEntity record);
}