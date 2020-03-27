package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimMainEntity;
import com.junling.mis.model.secondary.claimMainEntityWithBLOBs;

public interface claimMainEntityMapper {
    int deleteByPrimaryKey(String docuno);

    int insert(claimMainEntityWithBLOBs record);

    int insertSelective(claimMainEntityWithBLOBs record);

    claimMainEntityWithBLOBs selectByPrimaryKey(String docuno);

    int updateByPrimaryKeySelective(claimMainEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(claimMainEntityWithBLOBs record);

    int updateByPrimaryKey(claimMainEntity record);
}