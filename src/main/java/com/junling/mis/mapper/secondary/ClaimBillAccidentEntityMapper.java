package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.ClaimBillAccidentEntity;

public interface ClaimBillAccidentEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClaimBillAccidentEntity record);

    int insertSelective(ClaimBillAccidentEntity record);

    ClaimBillAccidentEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClaimBillAccidentEntity record);

    int updateByPrimaryKey(ClaimBillAccidentEntity record);
}