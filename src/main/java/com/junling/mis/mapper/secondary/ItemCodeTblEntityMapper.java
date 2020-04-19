package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ItemCodeTblEntity;

public interface ItemCodeTblEntityMapper {
    int deleteByPrimaryKey(String itemId);

    int insert(ItemCodeTblEntity record);

    int insertSelective(ItemCodeTblEntity record);

    ItemCodeTblEntity selectByPrimaryKey(String itemId);

    int updateByPrimaryKeySelective(ItemCodeTblEntity record);

    int updateByPrimaryKey(ItemCodeTblEntity record);
}