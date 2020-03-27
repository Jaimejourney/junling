package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.itemTypeTblEntity;

public interface itemTypeTblEntityMapper {
    int deleteByPrimaryKey(String itemTypeCode);

    int insert(itemTypeTblEntity record);

    int insertSelective(itemTypeTblEntity record);

    itemTypeTblEntity selectByPrimaryKey(String itemTypeCode);

    int updateByPrimaryKeySelective(itemTypeTblEntity record);

    int updateByPrimaryKey(itemTypeTblEntity record);
}