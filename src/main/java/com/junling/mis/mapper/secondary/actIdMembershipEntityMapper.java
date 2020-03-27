package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.actIdMembershipEntityKey;

public interface actIdMembershipEntityMapper {
    int deleteByPrimaryKey(actIdMembershipEntityKey key);

    int insert(actIdMembershipEntityKey record);

    int insertSelective(actIdMembershipEntityKey record);
}