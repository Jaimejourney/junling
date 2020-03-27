package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.inspectionReportEntity;

public interface inspectionReportEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(inspectionReportEntity record);

    int insertSelective(inspectionReportEntity record);

    inspectionReportEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(inspectionReportEntity record);

    int updateByPrimaryKey(inspectionReportEntity record);
}