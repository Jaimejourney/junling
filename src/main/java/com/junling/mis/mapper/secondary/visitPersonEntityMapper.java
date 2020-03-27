package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.visitPersonEntity;
import java.math.BigDecimal;

public interface visitPersonEntityMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(visitPersonEntity record);

    int insertSelective(visitPersonEntity record);

    visitPersonEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(visitPersonEntity record);

    int updateByPrimaryKey(visitPersonEntity record);
}