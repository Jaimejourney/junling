package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.GradeLevel;

public interface GradeLevelMapper {
    int deleteByPrimaryKey(String gradeLevelId);

    int insert(GradeLevel record);

    int insertSelective(GradeLevel record);

    GradeLevel selectByPrimaryKey(String gradeLevelId);

    int updateByPrimaryKeySelective(GradeLevel record);

    int updateByPrimaryKeyWithBLOBs(GradeLevel record);

    int updateByPrimaryKey(GradeLevel record);
}