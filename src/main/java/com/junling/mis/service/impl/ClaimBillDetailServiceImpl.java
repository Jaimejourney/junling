package com.junling.mis.service.impl;

import com.junling.mis.mapper.claimBillDetailEntityMapper;
import com.junling.mis.model.claimBillDetailEntity;
import com.junling.mis.model.claimBillDetailEntityKey;
import com.junling.mis.service.ClaimBillDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.junling.mis.service.ClaimBillDetailService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("claimBillDetailService")
public class ClaimBillDetailServiceImpl implements ClaimBillDetailService {

	private final static Logger LOG = LoggerFactory.getLogger(ClaimBillDetailServiceImpl.class);

	@Resource
	private claimBillDetailEntityMapper mapper;


	@Override
	public Boolean addClaimBillDetail(claimBillDetailEntity claimBillDetailEntity) throws Exception {
		return mapper.insert(claimBillDetailEntity) > 0;
	}

	@Override
	public Boolean updateClaimBillDetail(claimBillDetailEntity claimBillDetailEntity) throws Exception {
		return mapper.updateByPrimaryKey(claimBillDetailEntity) > 0;
	}

	@Override
	public claimBillDetailEntity findDetailClaimBillDetail(claimBillDetailEntityKey key) throws Exception {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public Boolean deleteClaimBillDetail(claimBillDetailEntityKey key) throws Exception {
		return mapper.deleteByPrimaryKey(key) > 0;
	}
}