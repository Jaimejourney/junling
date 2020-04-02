package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.policyPublicCoverage;
import com.junling.mis.service.primary.PolicyPublicCoverageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("policyPublicCoverageService")
public class PolicyPublicCoverageServiceImpl implements PolicyPublicCoverageService {

	private final static Logger LOG = LoggerFactory.getLogger(PolicyPublicCoverageServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.policyPublicCoverageMapper policyPublicCoverageMapper;

	@Override
	public Boolean addPolicyPublicCoverage(policyPublicCoverage policyPublicCoverage) throws Exception {
		return policyPublicCoverageMapper.insert(policyPublicCoverage)>0;
	}

	@Override
	public Boolean updatePolicyPublicCoverage(policyPublicCoverage policyPublicCoverage) throws Exception {
		return policyPublicCoverageMapper.updateByPrimaryKey(policyPublicCoverage)>0;
	}

	@Override
	public policyPublicCoverage findDetailPolicyPublicCoverage(String policyPublicCoverageId) throws Exception {
		return policyPublicCoverageMapper.selectByPrimaryKey(policyPublicCoverageId);
	}

	@Override
	public Boolean deletePolicyPublicCoverage(String policyPublicCoverageId) throws Exception {
		return policyPublicCoverageMapper.deleteByPrimaryKey(policyPublicCoverageId)>0;
	}

//	@Override
//	public Result addPolicyPublicCoverage(PolicyPublicCoverageModel policyPublicCoverageModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updatePolicyPublicCoverage(PolicyPublicCoverageModel policyPublicCoverageModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailPolicyPublicCoverage(PolicyPublicCoverageModel policyPublicCoverageModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyPublicCoverage(PolicyPublicCoverageModel policyPublicCoverageModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyPublicCoveragePage(PolicyPublicCoverageModel policyPublicCoverageModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countPolicyPublicCoverage(PolicyPublicCoverageModel policyPublicCoverageModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deletePolicyPublicCoverage(PolicyPublicCoverageModel policyPublicCoverageModel) throws Exception{
//		return null;
//	}

}