package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.visitApplyPersonEntity;
import java.math.BigDecimal;

public interface visitApplyPersonEntityMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(visitApplyPersonEntity record);

    int insertSelective(visitApplyPersonEntity record);

    visitApplyPersonEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(visitApplyPersonEntity record);

    int updateByPrimaryKey(visitApplyPersonEntity record);
}