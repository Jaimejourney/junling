package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.visitFeedbackEntity;
import java.math.BigDecimal;

public interface visitFeedbackEntityMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(visitFeedbackEntity record);

    int insertSelective(visitFeedbackEntity record);

    visitFeedbackEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(visitFeedbackEntity record);

    int updateByPrimaryKey(visitFeedbackEntity record);
}