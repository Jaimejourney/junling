package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.VisitImgAnXinEntity;

public interface VisitImgAnXinEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VisitImgAnXinEntity record);

    int insertSelective(VisitImgAnXinEntity record);

    VisitImgAnXinEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VisitImgAnXinEntity record);

    int updateByPrimaryKey(VisitImgAnXinEntity record);
}