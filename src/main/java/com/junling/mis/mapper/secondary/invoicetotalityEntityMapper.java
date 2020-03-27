package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.invoicetotalityEntity;

public interface invoicetotalityEntityMapper {
    int deleteByPrimaryKey(Long invoicetotalityId);

    int insert(invoicetotalityEntity record);

    int insertSelective(invoicetotalityEntity record);

    invoicetotalityEntity selectByPrimaryKey(Long invoicetotalityId);

    int updateByPrimaryKeySelective(invoicetotalityEntity record);

    int updateByPrimaryKey(invoicetotalityEntity record);
}