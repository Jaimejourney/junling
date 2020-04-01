package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.visitRecordEntity;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface visitRecordEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(visitRecordEntity record);

    int insertSelective(visitRecordEntity record);

    visitRecordEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(visitRecordEntity record);

    int updateByPrimaryKey(visitRecordEntity record);

    List<visitRecordEntity> search(@Param("start") Date start);
}