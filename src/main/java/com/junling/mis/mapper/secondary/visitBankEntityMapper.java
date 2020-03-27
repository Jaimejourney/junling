package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.visitBankEntity;
import java.math.BigDecimal;

public interface visitBankEntityMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(visitBankEntity record);

    int insertSelective(visitBankEntity record);

    visitBankEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(visitBankEntity record);

    int updateByPrimaryKey(visitBankEntity record);
}