package com.junling.mis.mapper.secondary;

import com.junling.mis.model.primary.CustomerBankInfo;
import com.junling.mis.model.secondary.VisitBankEntity;
import java.math.BigDecimal;

public interface VisitBankEntityMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(VisitBankEntity record);

    int insertSelective(VisitBankEntity record);

    VisitBankEntity selectByPrimaryKey(BigDecimal id);

    VisitBankEntity selectByOpenId(String openId);

    int updateByPrimaryKeySelective(VisitBankEntity record);

    int updateByPrimaryKey(VisitBankEntity record);
}