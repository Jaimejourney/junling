package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.claimBillDetailMapper;
import com.junling.mis.model.primary.claimBillDetail;
import com.junling.mis.model.primary.claimBillDetailKey;
import com.junling.mis.service.primary.ClaimBillDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	private claimBillDetailMapper mapper;


	@Override
	public Boolean addClaimBillDetail(claimBillDetail claimBillDetail) throws Exception {
		return mapper.insert(claimBillDetail) > 0;
	}

	@Override
	public Boolean updateClaimBillDetail(claimBillDetail claimBillDetail) throws Exception {
		return mapper.updateByPrimaryKey(claimBillDetail) > 0;
	}

	@Override
	public claimBillDetail findDetailClaimBillDetail(claimBillDetailKey key) throws Exception {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public Boolean deleteClaimBillDetail(claimBillDetailKey key) throws Exception {
		return mapper.deleteByPrimaryKey(key) > 0;
	}
}