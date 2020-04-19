package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ActIdMembershipEntityKey;

public interface ActIdMembershipEntityMapper {
    int deleteByPrimaryKey(ActIdMembershipEntityKey key);

    int insert(ActIdMembershipEntityKey record);

    int insertSelective(ActIdMembershipEntityKey record);
}