package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.policyShareCoverageEntity;
import com.junling.mis.model.primary.policyShareCoverageEntityKey;
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
	private com.junling.mis.mapper.primary.policyShareCoverageEntityMapper policyShareCoverageEntityMapper;

	@Override
	public Boolean addPolicyShareCoverage(policyShareCoverageEntity policyShareCoverageEntity) throws Exception {
		return policyShareCoverageEntityMapper.insert(policyShareCoverageEntity)>0;
	}

	@Override
	public Boolean updatePolicyShareCoverage(policyShareCoverageEntity policyShareCoverageEntity) throws Exception {
		return policyShareCoverageEntityMapper.updateByPrimaryKey(policyShareCoverageEntity)>0;
	}

	@Override
	public policyShareCoverageEntity findDetailPolicyShareCoverage(policyShareCoverageEntityKey key) throws Exception {
		return policyShareCoverageEntityMapper.selectByPrimaryKey(key);
	}

	@Override
	public Boolean deletePolicyShareCoverage(policyShareCoverageEntityKey key) throws Exception {
		return policyShareCoverageEntityMapper.deleteByPrimaryKey(key)>0;
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