package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.visitImgProblemEntity;

public interface visitImgProblemEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(visitImgProblemEntity record);

    int insertSelective(visitImgProblemEntity record);

    visitImgProblemEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(visitImgProblemEntity record);

    int updateByPrimaryKey(visitImgProblemEntity record);
}