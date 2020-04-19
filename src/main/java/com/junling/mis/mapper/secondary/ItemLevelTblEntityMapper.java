package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ItemLevelTblEntity;

public interface ItemLevelTblEntityMapper {
    int deleteByPrimaryKey(String itemLevelCode);

    int insert(ItemLevelTblEntity record);

    int insertSelective(ItemLevelTblEntity record);

    ItemLevelTblEntity selectByPrimaryKey(String itemLevelCode);

    int updateByPrimaryKeySelective(ItemLevelTblEntity record);

    int updateByPrimaryKey(ItemLevelTblEntity record);
}