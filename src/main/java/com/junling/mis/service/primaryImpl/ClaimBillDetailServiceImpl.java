package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.ClaimBillDetailMapper;
import com.junling.mis.model.primary.ClaimBillDetail;
import com.junling.mis.model.primary.ClaimBillDetailKey;
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
	private ClaimBillDetailMapper mapper;


	@Override
	public Boolean addClaimBillDetail(ClaimBillDetail claimBillDetail) throws Exception {
		return mapper.insert(claimBillDetail) > 0;
	}

	@Override
	public Boolean updateClaimBillDetail(ClaimBillDetail claimBillDetail) throws Exception {
		return mapper.updateByPrimaryKey(claimBillDetail) > 0;
	}

	@Override
	public ClaimBillDetail findDetailClaimBillDetail(ClaimBillDetailKey key) throws Exception {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public Boolean deleteClaimBillDetail(ClaimBillDetailKey key) throws Exception {
		return mapper.deleteByPrimaryKey(key) > 0;
	}
}