package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actReModelEntity;

public interface actReModelEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actReModelEntity record);

    int insertSelective(actReModelEntity record);

    actReModelEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actReModelEntity record);

    int updateByPrimaryKey(actReModelEntity record);
}