package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.visitProblemCaseEntity;

public interface visitProblemCaseEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(visitProblemCaseEntity record);

    int insertSelective(visitProblemCaseEntity record);

    visitProblemCaseEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(visitProblemCaseEntity record);

    int updateByPrimaryKey(visitProblemCaseEntity record);
}