package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.labReportItemInfoEntity;

public interface labReportItemInfoEntityMapper {
    int deleteByPrimaryKey(String labitemrcdflow);

    int insert(labReportItemInfoEntity record);

    int insertSelective(labReportItemInfoEntity record);

    labReportItemInfoEntity selectByPrimaryKey(String labitemrcdflow);

    int updateByPrimaryKeySelective(labReportItemInfoEntity record);

    int updateByPrimaryKey(labReportItemInfoEntity record);
}