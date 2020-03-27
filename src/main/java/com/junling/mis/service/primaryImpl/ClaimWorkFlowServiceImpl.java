package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.claimWorkFlowEntityMapper;
import com.junling.mis.model.primary.claimWorkFlowEntity;
import com.junling.mis.service.primary.ClaimWorkFlowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("claimWorkFlowService")
public class ClaimWorkFlowServiceImpl implements ClaimWorkFlowService {

	private final static Logger LOG = LoggerFactory.getLogger(ClaimWorkFlowServiceImpl.class);

	@Resource
	private claimWorkFlowEntityMapper claimWorkFlowEntityMapper;


	@Override
	public Boolean addClaimWorkFlow(claimWorkFlowEntity claimWorkFlowEntity) throws Exception {
		return claimWorkFlowEntityMapper.insert(claimWorkFlowEntity) > 0;
	}

	@Override
	public Boolean updateClaimWorkFlow(claimWorkFlowEntity claimWorkFlowEntity) throws Exception {
		return claimWorkFlowEntityMapper.updateByPrimaryKey(claimWorkFlowEntity) > 0;
	}

	@Override
	public claimWorkFlowEntity findDetailClaimWorkFlow(String claimWorkFlowId) throws Exception {
		return claimWorkFlowEntityMapper.selectByPrimaryKey(claimWorkFlowId);
	}

	@Override
	public Boolean deleteClaimWorkFlow(String claimWorkFlowId) throws Exception {
		return claimWorkFlowEntityMapper.deleteByPrimaryKey(claimWorkFlowId) > 0;
	}
}