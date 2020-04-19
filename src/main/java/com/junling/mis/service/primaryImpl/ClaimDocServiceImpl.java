package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.ClaimDocMapper;
import com.junling.mis.model.primary.ClaimDoc;
import com.junling.mis.model.primary.ClaimDocKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.junling.mis.service.primary.ClaimDocService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("claimDocService")
public class ClaimDocServiceImpl implements ClaimDocService {

	private final static Logger LOG = LoggerFactory.getLogger(ClaimDocServiceImpl.class);

	@Resource
	private ClaimDocMapper claimDocMapper;

	@Override
	public Boolean addClaimDoc(ClaimDoc claimDoc) throws Exception {
		return claimDocMapper.insert(claimDoc) > 0;
	}

	@Override
	public Boolean updateClaimDoc(ClaimDoc claimDoc) throws Exception {
		return claimDocMapper.updateByPrimaryKey(claimDoc) > 0;
	}

	@Override
	public ClaimDoc findDetailClaimDoc(ClaimDocKey key) throws Exception {
		return claimDocMapper.selectByPrimaryKey(key);
	}

	@Override
	public Boolean deleteClaimDoc(ClaimDocKey key) throws Exception {
		return claimDocMapper.deleteByPrimaryKey(key) > 0;
	}
}