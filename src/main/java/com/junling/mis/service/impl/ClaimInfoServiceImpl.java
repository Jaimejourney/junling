package com.junling.mis.service.impl;

import com.junling.mis.mapper.claimInfoEntityMapper;
import com.junling.mis.model.claimInfoEntity;
import com.junling.mis.model.claimInfoEntityKey;
import com.junling.mis.service.ClaimInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("claimInfoService")
public class ClaimInfoServiceImpl implements ClaimInfoService {

	private final static Logger LOG = LoggerFactory.getLogger(ClaimInfoServiceImpl.class);

	@Resource
	claimInfoEntityMapper claimInfoEntityMapper;


	@Override
	public Boolean addClaimInfo(claimInfoEntity claimInfoEntity) throws Exception {
		return claimInfoEntityMapper.insert(claimInfoEntity) > 0;
	}

	@Override
	public Boolean updateClaimInfo(claimInfoEntity claimInfoEntity) throws Exception {
		return claimInfoEntityMapper.updateByPrimaryKey(claimInfoEntity) > 0;
	}

	@Override
	public claimInfoEntity findDetailClaimInfo(claimInfoEntityKey key) throws Exception {
		return claimInfoEntityMapper.selectByPrimaryKey(key);
	}

	@Override
	public Boolean deleteClaimInfo(claimInfoEntityKey key) throws Exception {
		return claimInfoEntityMapper.deleteByPrimaryKey(key) > 0;
	}
}