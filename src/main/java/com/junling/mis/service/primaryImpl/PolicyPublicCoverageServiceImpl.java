package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.policyPublicCoverageEntity;
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
	private com.junling.mis.mapper.primary.policyPublicCoverageEntityMapper policyPublicCoverageEntityMapper;

	@Override
	public Boolean addPolicyPublicCoverage(policyPublicCoverageEntity policyPublicCoverageEntity) throws Exception {
		return policyPublicCoverageEntityMapper.insert(policyPublicCoverageEntity)>0;
	}

	@Override
	public Boolean updatePolicyPublicCoverage(policyPublicCoverageEntity policyPublicCoverageEntity) throws Exception {
		return policyPublicCoverageEntityMapper.updateByPrimaryKey(policyPublicCoverageEntity)>0;
	}

	@Override
	public policyPublicCoverageEntity findDetailPolicyPublicCoverage(String policyPublicCoverageId) throws Exception {
		return policyPublicCoverageEntityMapper.selectByPrimaryKey(policyPublicCoverageId);
	}

	@Override
	public Boolean deletePolicyPublicCoverage(String policyPublicCoverageId) throws Exception {
		return policyPublicCoverageEntityMapper.deleteByPrimaryKey(policyPublicCoverageId)>0;
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