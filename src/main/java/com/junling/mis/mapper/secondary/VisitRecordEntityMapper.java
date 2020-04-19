package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.VisitRecordEntity;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface VisitRecordEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(VisitRecordEntity record);

    int insertSelective(VisitRecordEntity record);

    VisitRecordEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(VisitRecordEntity record);

    int updateByPrimaryKey(VisitRecordEntity record);

    List<VisitRecordEntity> search(@Param("start") Date start);
}