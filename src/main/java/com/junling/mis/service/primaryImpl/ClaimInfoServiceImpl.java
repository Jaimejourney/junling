package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.ClaimInfoMapper;
import com.junling.mis.model.primary.ClaimInfo;
import com.junling.mis.model.primary.ClaimInfoKey;
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
	ClaimInfoMapper claimInfoMapper;


	@Override
	public Boolean addClaimInfo(ClaimInfo claimInfo) throws Exception {
		return claimInfoMapper.insert(claimInfo) > 0;
	}

	@Override
	public Boolean updateClaimInfo(ClaimInfo claimInfo) throws Exception {
		return claimInfoMapper.updateByPrimaryKey(claimInfo) > 0;
	}

	@Override
	public ClaimInfo findDetailClaimInfo(ClaimInfoKey key) throws Exception {
		return claimInfoMapper.selectByPrimaryKey(key);
	}

	@Override
	public Boolean deleteClaimInfo(ClaimInfoKey key) throws Exception {
		return claimInfoMapper.deleteByPrimaryKey(key) > 0;
	}
}