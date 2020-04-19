package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActIdGroupEntity;

public interface ActIdGroupEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActIdGroupEntity record);

    int insertSelective(ActIdGroupEntity record);

    ActIdGroupEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActIdGroupEntity record);

    int updateByPrimaryKey(ActIdGroupEntity record);
}