package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimMedicalExpenseEntity;

public interface claimMedicalExpenseEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(claimMedicalExpenseEntity record);

    int insertSelective(claimMedicalExpenseEntity record);

    claimMedicalExpenseEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(claimMedicalExpenseEntity record);

    int updateByPrimaryKey(claimMedicalExpenseEntity record);
}