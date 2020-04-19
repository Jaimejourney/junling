package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.PolicyShareCoverageMapper;
import com.junling.mis.model.primary.PolicyShareCoverage;
import com.junling.mis.model.primary.PolicyShareCoverageKey;
import com.junling.mis.service.primary.PolicyShareCoverageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("policyShareCoverageService")
public class PolicyShareCoverageServiceImpl implements PolicyShareCoverageService {

	private final static Logger LOG = LoggerFactory.getLogger(PolicyShareCoverageServiceImpl.class);

	@Resource
	private PolicyShareCoverageMapper policyShareCoverageMapper;

	@Override
	public Boolean addPolicyShareCoverage(PolicyShareCoverage policyShareCoverage) throws Exception {
		return policyShareCoverageMapper.insert(policyShareCoverage)>0;
	}

	@Override
	public Boolean updatePolicyShareCoverage(PolicyShareCoverage policyShareCoverage) throws Exception {
		return policyShareCoverageMapper.updateByPrimaryKey(policyShareCoverage)>0;
	}

	@Override
	public PolicyShareCoverage findDetailPolicyShareCoverage(PolicyShareCoverageKey key) throws Exception {
		return policyShareCoverageMapper.selectByPrimaryKey(key);
	}

	@Override
	public Boolean deletePolicyShareCoverage(PolicyShareCoverageKey key) throws Exception {
		return policyShareCoverageMapper.deleteByPrimaryKey(key)>0;
	}


//	@Override
//	public Result addPolicyShareCoverage(PolicyShareCoverageModel policyShareCoverageModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updatePolicyShareCoverage(PolicyShareCoverageModel policyShareCoverageModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailPolicyShareCoverage(PolicyShareCoverageModel policyShareCoverageModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyShareCoverage(PolicyShareCoverageModel policyShareCoverageModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyShareCoveragePage(PolicyShareCoverageModel policyShareCoverageModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countPolicyShareCoverage(PolicyShareCoverageModel policyShareCoverageModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deletePolicyShareCoverage(PolicyShareCoverageModel policyShareCoverageModel) throws Exception{
//		return null;
//	}

}