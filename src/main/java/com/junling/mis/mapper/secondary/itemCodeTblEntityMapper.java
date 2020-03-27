package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.itemCodeTblEntity;

public interface itemCodeTblEntityMapper {
    int deleteByPrimaryKey(String itemId);

    int insert(itemCodeTblEntity record);

    int insertSelective(itemCodeTblEntity record);

    itemCodeTblEntity selectByPrimaryKey(String itemId);

    int updateByPrimaryKeySelective(itemCodeTblEntity record);

    int updateByPrimaryKey(itemCodeTblEntity record);
}