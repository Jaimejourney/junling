package com.junling.mis.service.impl;

import com.junling.mis.mapper.policyBenefitEntityMapper;
import com.junling.mis.model.policyBenefitEntity;
import com.junling.mis.service.PolicyBenefitService;
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
	private com.junling.mis.mapper.policyBenefitEntityMapper policyBenefitEntityMapper;

	@Override
	public Boolean addPolicyBenefit(policyBenefitEntity policyBenefitModel) throws Exception {
		return policyBenefitEntityMapper.insert(policyBenefitModel) > 0;
	}

	@Override
	public Boolean updatePolicyBenefit(policyBenefitEntity policyBenefitEntity) throws Exception {
		return policyBenefitEntityMapper.updateByPrimaryKey(policyBenefitEntity) > 0;
	}

	@Override
	public policyBenefitEntity findDetailPolicyBenefit(String policyBenefitId) throws Exception {
		return policyBenefitEntityMapper.selectByPrimaryKey(policyBenefitId);
	}

	@Override
	public Boolean deletePolicyBenefit(String policyBenefitId) throws Exception {
		return policyBenefitEntityMapper.deleteByPrimaryKey(policyBenefitId) > 0;
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