package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.sysNoticeEntity;

public interface sysNoticeEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(sysNoticeEntity record);

    int insertSelective(sysNoticeEntity record);

    sysNoticeEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(sysNoticeEntity record);

    int updateByPrimaryKeyWithBLOBs(sysNoticeEntity record);

    int updateByPrimaryKey(sysNoticeEntity record);
}