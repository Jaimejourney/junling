package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimMainEntity;
import com.junling.mis.model.secondary.ClaimMainEntityWithBLOBs;

public interface ClaimMainEntityMapper {
    int deleteByPrimaryKey(String docuno);

    int insert(ClaimMainEntityWithBLOBs record);

    int insertSelective(ClaimMainEntityWithBLOBs record);

    ClaimMainEntityWithBLOBs selectByPrimaryKey(String docuno);

    int updateByPrimaryKeySelective(ClaimMainEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ClaimMainEntityWithBLOBs record);

    int updateByPrimaryKey(ClaimMainEntity record);
}