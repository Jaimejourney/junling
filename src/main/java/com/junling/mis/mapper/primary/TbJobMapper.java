package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbJob;

public interface TbJobMapper {
    int deleteByPrimaryKey(String jobCode);

    int insert(TbJob record);

    int insertSelective(TbJob record);

    TbJob selectByPrimaryKey(String jobCode);

    int updateByPrimaryKeySelective(TbJob record);

    int updateByPrimaryKey(TbJob record);
}