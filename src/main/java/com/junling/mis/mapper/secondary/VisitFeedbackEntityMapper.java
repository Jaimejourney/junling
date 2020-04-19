package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.VisitFeedbackEntity;
import java.math.BigDecimal;

public interface VisitFeedbackEntityMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(VisitFeedbackEntity record);

    int insertSelective(VisitFeedbackEntity record);

    VisitFeedbackEntity selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(VisitFeedbackEntity record);

    int updateByPrimaryKey(VisitFeedbackEntity record);
}