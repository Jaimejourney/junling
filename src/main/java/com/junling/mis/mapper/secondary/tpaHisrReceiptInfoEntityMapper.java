package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.tpaHisrReceiptInfoEntity;

public interface tpaHisrReceiptInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tpaHisrReceiptInfoEntity record);

    int insertSelective(tpaHisrReceiptInfoEntity record);

    tpaHisrReceiptInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tpaHisrReceiptInfoEntity record);

    int updateByPrimaryKey(tpaHisrReceiptInfoEntity record);
}