package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.visitRecordProcessEntity;

public interface visitRecordProcessEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(visitRecordProcessEntity record);

    int insertSelective(visitRecordProcessEntity record);

    visitRecordProcessEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(visitRecordProcessEntity record);

    int updateByPrimaryKey(visitRecordProcessEntity record);
}