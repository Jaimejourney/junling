package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.claimBillEntityMapper;
import com.junling.mis.model.primary.claimBillEntity;
import com.junling.mis.model.primary.claimBillEntityKey;
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
	private claimBillEntityMapper claimBillEntityMapper;


	@Override
	public Boolean addClaimBill(claimBillEntity claimBillEntity) throws Exception {
		return claimBillEntityMapper.insert(claimBillEntity) > 0;
	}

	@Override
	public Boolean updateClaimBill(claimBillEntity claimBillEntity) throws Exception {
		return claimBillEntityMapper.updateByPrimaryKey(claimBillEntity) > 0;
	}

	@Override
	public claimBillEntity findDetailClaimBill(claimBillEntityKey key) throws Exception {
		return claimBillEntityMapper.selectByPrimaryKey(key);
	}

	@Override
	public Boolean deleteClaimBill(claimBillEntityKey key) throws Exception {
		return claimBillEntityMapper.deleteByPrimaryKey(key) > 0;
	}
}