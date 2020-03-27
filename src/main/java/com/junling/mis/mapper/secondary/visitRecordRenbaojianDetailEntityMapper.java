package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.visitRecordRenbaojianDetailEntity;

public interface visitRecordRenbaojianDetailEntityMapper {
    int deleteByPrimaryKey(String visitId);

    int insert(visitRecordRenbaojianDetailEntity record);

    int insertSelective(visitRecordRenbaojianDetailEntity record);

    visitRecordRenbaojianDetailEntity selectByPrimaryKey(String visitId);

    int updateByPrimaryKeySelective(visitRecordRenbaojianDetailEntity record);

    int updateByPrimaryKeyWithBLOBs(visitRecordRenbaojianDetailEntity record);

    int updateByPrimaryKey(visitRecordRenbaojianDetailEntity record);
}