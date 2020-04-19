package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.VisitImageEntity;
import com.junling.mis.model.secondary.VisitImageEntityWithBLOBs;
import java.math.BigDecimal;

public interface VisitImageEntityMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(VisitImageEntityWithBLOBs record);

    int insertSelective(VisitImageEntityWithBLOBs record);

    VisitImageEntityWithBLOBs selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(VisitImageEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(VisitImageEntityWithBLOBs record);

    int updateByPrimaryKey(VisitImageEntity record);
}