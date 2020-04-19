package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.VisitPersonEntity;
import java.math.BigDecimal;

public interface VisitPersonEntityMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(VisitPersonEntity record);

    int insertSelective(VisitPersonEntity record);

    VisitPersonEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(VisitPersonEntity record);

    int updateByPrimaryKey(VisitPersonEntity record);
}