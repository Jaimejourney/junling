package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.visitImgAnXinEntity;

public interface visitImgAnXinEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(visitImgAnXinEntity record);

    int insertSelective(visitImgAnXinEntity record);

    visitImgAnXinEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(visitImgAnXinEntity record);

    int updateByPrimaryKey(visitImgAnXinEntity record);
}