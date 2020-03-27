package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.itemLevelTblEntity;

public interface itemLevelTblEntityMapper {
    int deleteByPrimaryKey(String itemLevelCode);

    int insert(itemLevelTblEntity record);

    int insertSelective(itemLevelTblEntity record);

    itemLevelTblEntity selectByPrimaryKey(String itemLevelCode);

    int updateByPrimaryKeySelective(itemLevelTblEntity record);

    int updateByPrimaryKey(itemLevelTblEntity record);
}