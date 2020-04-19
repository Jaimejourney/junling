package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.SysNoticeEntity;

public interface SysNoticeEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysNoticeEntity record);

    int insertSelective(SysNoticeEntity record);

    SysNoticeEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysNoticeEntity record);

    int updateByPrimaryKeyWithBLOBs(SysNoticeEntity record);

    int updateByPrimaryKey(SysNoticeEntity record);
}