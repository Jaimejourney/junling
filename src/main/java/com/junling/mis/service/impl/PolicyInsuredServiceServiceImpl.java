package com.junling.mis.service.impl;

import com.junling.mis.mapper.policyInsuredServiceEntityMapper;
import com.junling.mis.model.policyInsuredServiceEntity;
import com.junling.mis.service.PolicyInsuredServiceService;
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
	private com.junling.mis.mapper.policyInsuredServiceEntityMapper policyInsuredServiceEntityMapper;

	@Override
	public Boolean addPolicyInsuredService(policyInsuredServiceEntity policyInsuredServiceEntity) throws Exception {
		return policyInsuredServiceEntityMapper.insert(policyInsuredServiceEntity)>0;
	}

	@Override
	public Boolean updatePolicyInsuredService(policyInsuredServiceEntity policyInsuredServiceEntity) throws Exception {
		return policyInsuredServiceEntityMapper.updateByPrimaryKey(policyInsuredServiceEntity)>0;
	}

	@Override
	public policyInsuredServiceEntity findDetailPolicyInsuredService(String policyInsuredServiceId) throws Exception {
		return policyInsuredServiceEntityMapper.selectByPrimaryKey(policyInsuredServiceId);
	}

	@Override
	public Boolean deletePolicyInsuredService(String policyInsuredServiceId) throws Exception {
		return policyInsuredServiceEntityMapper.deleteByPrimaryKey(policyInsuredServiceId)>0;
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