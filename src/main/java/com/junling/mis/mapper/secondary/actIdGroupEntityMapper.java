package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actIdGroupEntity;

public interface actIdGroupEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(actIdGroupEntity record);

    int insertSelective(actIdGroupEntity record);

    actIdGroupEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(actIdGroupEntity record);

    int updateByPrimaryKey(actIdGroupEntity record);
}