package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.LabReportItemInfoEntity;

public interface LabReportItemInfoEntityMapper {
    int deleteByPrimaryKey(String labitemrcdflow);

    int insert(LabReportItemInfoEntity record);

    int insertSelective(LabReportItemInfoEntity record);

    LabReportItemInfoEntity selectByPrimaryKey(String labitemrcdflow);

    int updateByPrimaryKeySelective(LabReportItemInfoEntity record);

    int updateByPrimaryKey(LabReportItemInfoEntity record);
}