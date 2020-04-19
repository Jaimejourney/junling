package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.MaterialRepeatedlyRecordEntity;

public interface MaterialRepeatedlyRecordEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MaterialRepeatedlyRecordEntity record);

    int insertSelective(MaterialRepeatedlyRecordEntity record);

    MaterialRepeatedlyRecordEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MaterialRepeatedlyRecordEntity record);

    int updateByPrimaryKey(MaterialRepeatedlyRecordEntity record);
}