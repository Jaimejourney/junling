package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.VisitImgProblemEntity;

public interface VisitImgProblemEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VisitImgProblemEntity record);

    int insertSelective(VisitImgProblemEntity record);

    VisitImgProblemEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VisitImgProblemEntity record);

    int updateByPrimaryKey(VisitImgProblemEntity record);
}