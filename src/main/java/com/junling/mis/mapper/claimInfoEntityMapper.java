package com.junling.mis.mapper;

import com.junling.mis.model.claimInfoEntity;
import com.junling.mis.model.claimInfoEntityKey;

public interface claimInfoEntityMapper {
    int deleteByPrimaryKey(claimInfoEntityKey key);

    int insert(claimInfoEntity record);

    int insertSelective(claimInfoEntity record);

    claimInfoEntity selectByPrimaryKey(claimInfoEntityKey key);

    int updateByPrimaryKeySelective(claimInfoEntity record);

    int updateByPrimaryKey(claimInfoEntity record);
}