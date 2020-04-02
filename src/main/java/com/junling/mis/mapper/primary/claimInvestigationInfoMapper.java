package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.claimInvestigationInfo;

public interface claimInvestigationInfoMapper {
    int deleteByPrimaryKey(String claimInvestigationInfoId);

    int insert(claimInvestigationInfo record);

    int insertSelective(claimInvestigationInfo record);

    claimInvestigationInfo selectByPrimaryKey(String claimInvestigationInfoId);

    int updateByPrimaryKeySelective(claimInvestigationInfo record);

    int updateByPrimaryKey(claimInvestigationInfo record);
}