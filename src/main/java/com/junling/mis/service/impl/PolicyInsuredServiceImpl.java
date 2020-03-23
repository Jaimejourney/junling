package com.junling.mis.service.impl;

import com.junling.mis.mapper.policyInsuredEntityMapper;
import com.junling.mis.model.policyInsuredEntity;
import com.junling.mis.service.PolicyInsuredService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("policyInsuredService")
public class PolicyInsuredServiceImpl implements PolicyInsuredService {

	private final static Logger LOG = LoggerFactory.getLogger(PolicyInsuredServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.policyInsuredEntityMapper policyInsuredEntityMapper;

	@Override
	public Boolean addPolicyInsured(policyInsuredEntity policyInsuredEntity) throws Exception {
		return policyInsuredEntityMapper.insert(policyInsuredEntity)>0;
	}

	@Override
	public Boolean updatePolicyInsured(policyInsuredEntity policyInsuredEntity) throws Exception {
		return policyInsuredEntityMapper.updateByPrimaryKey(policyInsuredEntity)>0;
	}

	@Override
	public policyInsuredEntity findDetailPolicyInsured(String policyInsuredId) throws Exception {
		return policyInsuredEntityMapper.selectByPrimaryKey(policyInsuredId);
	}

	@Override
	public Boolean deletePolicyInsured(String policyInsuredId) throws Exception {
		return policyInsuredEntityMapper.deleteByPrimaryKey(policyInsuredId)>0;
	}

//	@Override
//	public Result addPolicyInsured(PolicyInsuredModel policyInsuredModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updatePolicyInsured(PolicyInsuredModel policyInsuredModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailPolicyInsured(PolicyInsuredModel policyInsuredModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyInsured(PolicyInsuredModel policyInsuredModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyInsuredPage(PolicyInsuredModel policyInsuredModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countPolicyInsured(PolicyInsuredModel policyInsuredModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deletePolicyInsured(PolicyInsuredModel policyInsuredModel) throws Exception{
//		return null;
//	}

}