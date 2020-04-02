package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.claimInfoMapper;
import com.junling.mis.model.primary.claimInfo;
import com.junling.mis.model.primary.claimInfoKey;
import com.junling.mis.service.primary.ClaimInfoService;
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
	claimInfoMapper claimInfoMapper;


	@Override
	public Boolean addClaimInfo(claimInfo claimInfo) throws Exception {
		return claimInfoMapper.insert(claimInfo) > 0;
	}

	@Override
	public Boolean updateClaimInfo(claimInfo claimInfo) throws Exception {
		return claimInfoMapper.updateByPrimaryKey(claimInfo) > 0;
	}

	@Override
	public claimInfo findDetailClaimInfo(claimInfoKey key) throws Exception {
		return claimInfoMapper.selectByPrimaryKey(key);
	}

	@Override
	public Boolean deleteClaimInfo(claimInfoKey key) throws Exception {
		return claimInfoMapper.deleteByPrimaryKey(key) > 0;
	}
}