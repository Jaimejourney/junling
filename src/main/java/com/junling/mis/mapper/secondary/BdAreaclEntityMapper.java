package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.BdAreaclEntity;

public interface BdAreaclEntityMapper {
    int insert(BdAreaclEntity record);

    int insertSelective(BdAreaclEntity record);
}