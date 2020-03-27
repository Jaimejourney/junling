package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.labReportMicrobesInfoEntity;

public interface labReportMicrobesInfoEntityMapper {
    int deleteByPrimaryKey(String recordmicrobesflow);

    int insert(labReportMicrobesInfoEntity record);

    int insertSelective(labReportMicrobesInfoEntity record);

    labReportMicrobesInfoEntity selectByPrimaryKey(String recordmicrobesflow);

    int updateByPrimaryKeySelective(labReportMicrobesInfoEntity record);

    int updateByPrimaryKey(labReportMicrobesInfoEntity record);
}