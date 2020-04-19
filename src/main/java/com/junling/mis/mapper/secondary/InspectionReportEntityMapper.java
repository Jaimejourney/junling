package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.InspectionReportEntity;

public interface InspectionReportEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(InspectionReportEntity record);

    int insertSelective(InspectionReportEntity record);

    InspectionReportEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(InspectionReportEntity record);

    int updateByPrimaryKey(InspectionReportEntity record);
}