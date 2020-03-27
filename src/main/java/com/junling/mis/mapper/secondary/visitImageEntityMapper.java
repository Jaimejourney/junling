package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.visitImageEntity;
import com.junling.mis.model.secondary.visitImageEntityWithBLOBs;
import java.math.BigDecimal;

public interface visitImageEntityMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(visitImageEntityWithBLOBs record);

    int insertSelective(visitImageEntityWithBLOBs record);

    visitImageEntityWithBLOBs selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(visitImageEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(visitImageEntityWithBLOBs record);

    int updateByPrimaryKey(visitImageEntity record);
}