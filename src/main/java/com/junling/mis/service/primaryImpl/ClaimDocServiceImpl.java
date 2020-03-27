package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.claimDocEntityMapper;
import com.junling.mis.model.primary.claimDocEntity;
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
	private claimDocEntityMapper claimDocEntityMapper;

	@Override
	public Boolean addClaimDoc(claimDocEntity claimDocEntity) throws Exception {
		return claimDocEntityMapper.insert(claimDocEntity) > 0;
	}

	@Override
	public Boolean updateClaimDoc(claimDocEntity claimDocEntity) throws Exception {
		return claimDocEntityMapper.updateByPrimaryKey(claimDocEntity) > 0;
	}

	@Override
	public claimDocEntity findDetailClaimDoc(Integer docId) throws Exception {
		return claimDocEntityMapper.selectByPrimaryKey(docId);
	}

	@Override
	public Boolean deleteClaimDoc(Integer docId) throws Exception {
		return claimDocEntityMapper.deleteByPrimaryKey(docId) > 0;
	}
}