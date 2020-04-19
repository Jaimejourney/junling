package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.ClaimBillMapper;
import com.junling.mis.model.primary.ClaimBill;
import com.junling.mis.model.primary.ClaimBillKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.junling.mis.service.primary.ClaimBillService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("claimBillService")
public class ClaimBillServiceImpl implements ClaimBillService {

	private final static Logger LOG = LoggerFactory.getLogger(ClaimBillServiceImpl.class);

	@Resource
	private ClaimBillMapper claimBillMapper;


	@Override
	public Boolean addClaimBill(ClaimBill claimBill) throws Exception {
		return claimBillMapper.insert(claimBill) > 0;
	}

	@Override
	public Boolean updateClaimBill(ClaimBill claimBill) throws Exception {
		return claimBillMapper.updateByPrimaryKey(claimBill) > 0;
	}

	@Override
	public ClaimBill findDetailClaimBill(ClaimBillKey key) throws Exception {
		return claimBillMapper.selectByPrimaryKey(key);
	}

	@Override
	public Boolean deleteClaimBill(ClaimBillKey key) throws Exception {
		return claimBillMapper.deleteByPrimaryKey(key) > 0;
	}
}