package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.ClaimWorkFlowMapper;
import com.junling.mis.model.primary.ClaimWorkFlow;
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
	private ClaimWorkFlowMapper claimWorkFlowMapper;


	@Override
	public Boolean addClaimWorkFlow(ClaimWorkFlow claimWorkFlow) throws Exception {
		return claimWorkFlowMapper.insert(claimWorkFlow) > 0;
	}

	@Override
	public Boolean updateClaimWorkFlow(ClaimWorkFlow claimWorkFlow) throws Exception {
		return claimWorkFlowMapper.updateByPrimaryKey(claimWorkFlow) > 0;
	}

	@Override
	public ClaimWorkFlow findDetailClaimWorkFlow(String claimWorkFlowId) throws Exception {
		return claimWorkFlowMapper.selectByPrimaryKey(claimWorkFlowId);
	}

	@Override
	public Boolean deleteClaimWorkFlow(String claimWorkFlowId) throws Exception {
		return claimWorkFlowMapper.deleteByPrimaryKey(claimWorkFlowId) > 0;
	}
}