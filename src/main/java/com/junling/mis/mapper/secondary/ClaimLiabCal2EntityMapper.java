package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimLiabCal2Entity;

public interface ClaimLiabCal2EntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClaimLiabCal2Entity record);

    int insertSelective(ClaimLiabCal2Entity record);

    ClaimLiabCal2Entity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClaimLiabCal2Entity record);

    int updateByPrimaryKey(ClaimLiabCal2Entity record);
}