package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimMedicalExpenseEntity;

public interface ClaimMedicalExpenseEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClaimMedicalExpenseEntity record);

    int insertSelective(ClaimMedicalExpenseEntity record);

    ClaimMedicalExpenseEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClaimMedicalExpenseEntity record);

    int updateByPrimaryKey(ClaimMedicalExpenseEntity record);
}