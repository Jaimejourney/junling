package com.junling.mis.mapper.secondary;

import com.junling.mis.model.secondary.claimBillAccidentEntity;

public interface claimBillAccidentEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(claimBillAccidentEntity record);

    int insertSelective(claimBillAccidentEntity record);

    claimBillAccidentEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(claimBillAccidentEntity record);

    int updateByPrimaryKey(claimBillAccidentEntity record);
}