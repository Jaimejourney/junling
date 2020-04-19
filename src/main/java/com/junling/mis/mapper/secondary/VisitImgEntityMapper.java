package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.VisitImgEntity;

public interface VisitImgEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VisitImgEntity record);

    int insertSelective(VisitImgEntity record);

    VisitImgEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VisitImgEntity record);

    int updateByPrimaryKey(VisitImgEntity record);
}