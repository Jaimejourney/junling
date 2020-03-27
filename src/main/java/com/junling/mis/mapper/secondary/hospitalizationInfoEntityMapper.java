package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.hospitalizationInfoEntity;

public interface hospitalizationInfoEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(hospitalizationInfoEntity record);

    int insertSelective(hospitalizationInfoEntity record);

    hospitalizationInfoEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(hospitalizationInfoEntity record);

    int updateByPrimaryKey(hospitalizationInfoEntity record);
}