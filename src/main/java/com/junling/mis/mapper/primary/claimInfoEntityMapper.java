package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.claimInfoEntity;
import com.junling.mis.model.primary.claimInfoEntityKey;

public interface claimInfoEntityMapper {
    int deleteByPrimaryKey(claimInfoEntityKey key);

    int insert(claimInfoEntity record);

    int insertSelective(claimInfoEntity record);

    claimInfoEntity selectByPrimaryKey(claimInfoEntityKey key);

    int updateByPrimaryKeySelective(claimInfoEntity record);

    int updateByPrimaryKey(claimInfoEntity record);
}