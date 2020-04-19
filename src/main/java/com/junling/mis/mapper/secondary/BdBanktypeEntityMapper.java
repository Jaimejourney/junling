package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.BdBanktypeEntity;

public interface BdBanktypeEntityMapper {
    int insert(BdBanktypeEntity record);

    int insertSelective(BdBanktypeEntity record);
}