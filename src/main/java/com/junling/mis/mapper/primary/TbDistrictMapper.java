package com.junling.mis.mapper.primary;

import com.junling.mis.model.primary.TbDistrict;

public interface TbDistrictMapper {
    int deleteByPrimaryKey(String districtCode);

    int insert(TbDistrict record);

    int insertSelective(TbDistrict record);

    TbDistrict selectByPrimaryKey(String districtCode);

    int updateByPrimaryKeySelective(TbDistrict record);

    int updateByPrimaryKey(TbDistrict record);
}