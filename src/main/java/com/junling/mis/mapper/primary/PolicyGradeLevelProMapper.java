package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.PolicyGradeLevelPro;

public interface PolicyGradeLevelProMapper {
    int deleteByPrimaryKey(String pglProductId);

    int insert(PolicyGradeLevelPro record);

    int insertSelective(PolicyGradeLevelPro record);

    PolicyGradeLevelPro selectByPrimaryKey(String pglProductId);

    PolicyGradeLevelPro selectByPolNo(String polNo);

    int updateByPrimaryKeySelective(PolicyGradeLevelPro record);

    int updateByPrimaryKey(PolicyGradeLevelPro record);
}