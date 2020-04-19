package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.TpaHisrReceiptInfoEntity;

public interface TpaHisrReceiptInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TpaHisrReceiptInfoEntity record);

    int insertSelective(TpaHisrReceiptInfoEntity record);

    TpaHisrReceiptInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TpaHisrReceiptInfoEntity record);

    int updateByPrimaryKey(TpaHisrReceiptInfoEntity record);
}