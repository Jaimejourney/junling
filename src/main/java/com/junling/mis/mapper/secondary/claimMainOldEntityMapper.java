package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimMainOldEntity;
import com.junling.mis.model.secondary.claimMainOldEntityKey;
import com.junling.mis.model.secondary.claimMainOldEntityWithBLOBs;

public interface claimMainOldEntityMapper {
    int deleteByPrimaryKey(claimMainOldEntityKey key);

    int insert(claimMainOldEntityWithBLOBs record);

    int insertSelective(claimMainOldEntityWithBLOBs record);

    claimMainOldEntityWithBLOBs selectByPrimaryKey(claimMainOldEntityKey key);

    int updateByPrimaryKeySelective(claimMainOldEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(claimMainOldEntityWithBLOBs record);

    int updateByPrimaryKey(claimMainOldEntity record);
}