package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.claimBillMapper;
import com.junling.mis.model.primary.claimBill;
import com.junling.mis.model.primary.claimBillKey;
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
	private claimBillMapper claimBillMapper;


	@Override
	public Boolean addClaimBill(claimBill claimBill) throws Exception {
		return claimBillMapper.insert(claimBill) > 0;
	}

	@Override
	public Boolean updateClaimBill(claimBill claimBill) throws Exception {
		return claimBillMapper.updateByPrimaryKey(claimBill) > 0;
	}

	@Override
	public claimBill findDetailClaimBill(claimBillKey key) throws Exception {
		return claimBillMapper.selectByPrimaryKey(key);
	}

	@Override
	public Boolean deleteClaimBill(claimBillKey key) throws Exception {
		return claimBillMapper.deleteByPrimaryKey(key) > 0;
	}
}