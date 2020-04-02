package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.gradeLevel;

public interface gradeLevelMapper {
    int deleteByPrimaryKey(String gradeLevelId);

    int insert(gradeLevel record);

    int insertSelective(gradeLevel record);

    gradeLevel selectByPrimaryKey(String gradeLevelId);

    int updateByPrimaryKeySelective(gradeLevel record);

    int updateByPrimaryKeyWithBLOBs(gradeLevel record);

    int updateByPrimaryKey(gradeLevel record);
}