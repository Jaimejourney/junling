package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.VisitProblemCaseEntity;

public interface VisitProblemCaseEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VisitProblemCaseEntity record);

    int insertSelective(VisitProblemCaseEntity record);

    VisitProblemCaseEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VisitProblemCaseEntity record);

    int updateByPrimaryKey(VisitProblemCaseEntity record);
}