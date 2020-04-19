package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ItemTypeTblEntity;

public interface ItemTypeTblEntityMapper {
    int deleteByPrimaryKey(String itemTypeCode);

    int insert(ItemTypeTblEntity record);

    int insertSelective(ItemTypeTblEntity record);

    ItemTypeTblEntity selectByPrimaryKey(String itemTypeCode);

    int updateByPrimaryKeySelective(ItemTypeTblEntity record);

    int updateByPrimaryKey(ItemTypeTblEntity record);
}