package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.claimWorkFlowMapper;
import com.junling.mis.model.primary.claimWorkFlow;
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
	private claimWorkFlowMapper claimWorkFlowMapper;


	@Override
	public Boolean addClaimWorkFlow(claimWorkFlow claimWorkFlow) throws Exception {
		return claimWorkFlowMapper.insert(claimWorkFlow) > 0;
	}

	@Override
	public Boolean updateClaimWorkFlow(claimWorkFlow claimWorkFlow) throws Exception {
		return claimWorkFlowMapper.updateByPrimaryKey(claimWorkFlow) > 0;
	}

	@Override
	public claimWorkFlow findDetailClaimWorkFlow(String claimWorkFlowId) throws Exception {
		return claimWorkFlowMapper.selectByPrimaryKey(claimWorkFlowId);
	}

	@Override
	public Boolean deleteClaimWorkFlow(String claimWorkFlowId) throws Exception {
		return claimWorkFlowMapper.deleteByPrimaryKey(claimWorkFlowId) > 0;
	}
}