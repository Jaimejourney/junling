package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.materialRepeatedlyRecordEntity;

public interface materialRepeatedlyRecordEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(materialRepeatedlyRecordEntity record);

    int insertSelective(materialRepeatedlyRecordEntity record);

    materialRepeatedlyRecordEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(materialRepeatedlyRecordEntity record);

    int updateByPrimaryKey(materialRepeatedlyRecordEntity record);
}