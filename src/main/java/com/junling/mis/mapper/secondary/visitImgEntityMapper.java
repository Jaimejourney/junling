package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.visitImgEntity;

public interface visitImgEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(visitImgEntity record);

    int insertSelective(visitImgEntity record);

    visitImgEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(visitImgEntity record);

    int updateByPrimaryKey(visitImgEntity record);
}