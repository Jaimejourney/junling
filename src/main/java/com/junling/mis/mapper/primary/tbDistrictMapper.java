package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.tbDistrict;

public interface tbDistrictMapper {
    int deleteByPrimaryKey(String districtCode);

    int insert(tbDistrict record);

    int insertSelective(tbDistrict record);

    tbDistrict selectByPrimaryKey(String districtCode);

    int updateByPrimaryKeySelective(tbDistrict record);

    int updateByPrimaryKey(tbDistrict record);
}