package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimMainOldEntity;
import com.junling.mis.model.secondary.ClaimMainOldEntityKey;
import com.junling.mis.model.secondary.ClaimMainOldEntityWithBLOBs;

public interface ClaimMainOldEntityMapper {
    int deleteByPrimaryKey(ClaimMainOldEntityKey key);

    int insert(ClaimMainOldEntityWithBLOBs record);

    int insertSelective(ClaimMainOldEntityWithBLOBs record);

    ClaimMainOldEntityWithBLOBs selectByPrimaryKey(ClaimMainOldEntityKey key);

    int updateByPrimaryKeySelective(ClaimMainOldEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ClaimMainOldEntityWithBLOBs record);

    int updateByPrimaryKey(ClaimMainOldEntity record);
}