package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.PolicyInsuredServiceMapper;
import com.junling.mis.model.primary.PolicyInsuredService;
import com.junling.mis.service.primary.PolicyInsuredServiceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("policyInsuredServiceService")
public class PolicyInsuredServiceServiceImpl implements PolicyInsuredServiceService {

	private final static Logger LOG = LoggerFactory.getLogger(PolicyInsuredServiceServiceImpl.class);

	@Resource
	private PolicyInsuredServiceMapper policyInsuredServiceMapper;

	@Override
	public Boolean addPolicyInsuredService(PolicyInsuredService policyInsuredService) throws Exception {
		return policyInsuredServiceMapper.insert(policyInsuredService)>0;
	}

	@Override
	public Boolean updatePolicyInsuredService(PolicyInsuredService policyInsuredService) throws Exception {
		return policyInsuredServiceMapper.updateByPrimaryKey(policyInsuredService)>0;
	}

	@Override
	public PolicyInsuredService findDetailPolicyInsuredService(String policyInsuredServiceId) throws Exception {
		return policyInsuredServiceMapper.selectByPrimaryKey(policyInsuredServiceId);
	}

	@Override
	public Boolean deletePolicyInsuredService(String policyInsuredServiceId) throws Exception {
		return policyInsuredServiceMapper.deleteByPrimaryKey(policyInsuredServiceId)>0;
	}

//	@Override
//	public Result addPolicyInsuredService(PolicyInsuredServiceModel policyInsuredServiceModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updatePolicyInsuredService(PolicyInsuredServiceModel policyInsuredServiceModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailPolicyInsuredService(PolicyInsuredServiceModel policyInsuredServiceModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyInsuredService(PolicyInsuredServiceModel policyInsuredServiceModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyInsuredServicePage(PolicyInsuredServiceModel policyInsuredServiceModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countPolicyInsuredService(PolicyInsuredServiceModel policyInsuredServiceModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deletePolicyInsuredService(PolicyInsuredServiceModel policyInsuredServiceModel) throws Exception{
//		return null;
//	}

}