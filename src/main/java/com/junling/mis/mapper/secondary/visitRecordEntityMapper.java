package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.visitRecordEntity;

public interface visitRecordEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(visitRecordEntity record);

    int insertSelective(visitRecordEntity record);

    visitRecordEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(visitRecordEntity record);

    int updateByPrimaryKey(visitRecordEntity record);
}