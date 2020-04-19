package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.VisitApplyPersonEntity;
import java.math.BigDecimal;

public interface VisitApplyPersonEntityMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(VisitApplyPersonEntity record);

    int insertSelective(VisitApplyPersonEntity record);

    VisitApplyPersonEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(VisitApplyPersonEntity record);

    int updateByPrimaryKey(VisitApplyPersonEntity record);
}