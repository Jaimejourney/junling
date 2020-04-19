package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.PolicyBenefitMapper;
import com.junling.mis.model.primary.PolicyBenefit;
import com.junling.mis.service.primary.PolicyBenefitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("policyBenefitService")
public class PolicyBenefitServiceImpl implements PolicyBenefitService {

	private final static Logger LOG = LoggerFactory.getLogger(PolicyBenefitServiceImpl.class);

	@Resource
	private PolicyBenefitMapper policyBenefitMapper;

	@Override
	public Boolean addPolicyBenefit(PolicyBenefit policyBenefitModel) throws Exception {
		return policyBenefitMapper.insert(policyBenefitModel) > 0;
	}

	@Override
	public Boolean updatePolicyBenefit(PolicyBenefit policyBenefit) throws Exception {
		return policyBenefitMapper.updateByPrimaryKey(policyBenefit) > 0;
	}

	@Override
	public PolicyBenefit findDetailPolicyBenefit(String policyBenefitId) throws Exception {
		return policyBenefitMapper.selectByPrimaryKey(policyBenefitId);
	}

	@Override
	public Boolean deletePolicyBenefit(String policyBenefitId) throws Exception {
		return policyBenefitMapper.deleteByPrimaryKey(policyBenefitId) > 0;
	}

//	@Override
//	public Result addPolicyBenefit(PolicyBenefitModel policyBenefitModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updatePolicyBenefit(PolicyBenefitModel policyBenefitModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailPolicyBenefit(PolicyBenefitModel policyBenefitModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyBenefit(PolicyBenefitModel policyBenefitModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyBenefitPage(PolicyBenefitModel policyBenefitModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countPolicyBenefit(PolicyBenefitModel policyBenefitModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deletePolicyBenefit(PolicyBenefitModel policyBenefitModel) throws Exception{
//		return null;
//	}

}