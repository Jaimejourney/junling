package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.RiskDetailStddiseaseEntity;

public interface RiskDetailStddiseaseEntityMapper {
    int deleteByPrimaryKey(Integer stddiseaseid);

    int insert(RiskDetailStddiseaseEntity record);

    int insertSelective(RiskDetailStddiseaseEntity record);

    RiskDetailStddiseaseEntity selectByPrimaryKey(Integer stddiseaseid);

    int updateByPrimaryKeySelective(RiskDetailStddiseaseEntity record);

    int updateByPrimaryKey(RiskDetailStddiseaseEntity record);
}