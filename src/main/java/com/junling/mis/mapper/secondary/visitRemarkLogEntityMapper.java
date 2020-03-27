package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.visitRemarkLogEntity;

public interface visitRemarkLogEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(visitRemarkLogEntity record);

    int insertSelective(visitRemarkLogEntity record);

    visitRemarkLogEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(visitRemarkLogEntity record);

    int updateByPrimaryKey(visitRemarkLogEntity record);
}