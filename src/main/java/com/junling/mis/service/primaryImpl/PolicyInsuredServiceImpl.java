package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.policyInsured;
import com.junling.mis.service.primary.PolicyInsuredService;
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
	private com.junling.mis.mapper.primary.policyInsuredMapper policyInsuredMapper;

	@Override
	public Boolean addPolicyInsured(policyInsured policyInsured) throws Exception {
		return policyInsuredMapper.insert(policyInsured)>0;
	}

	@Override
	public Boolean updatePolicyInsured(policyInsured policyInsured) throws Exception {
		return policyInsuredMapper.updateByPrimaryKey(policyInsured)>0;
	}

	@Override
	public policyInsured findDetailPolicyInsured(String policyInsuredId) throws Exception {
		return policyInsuredMapper.selectByPrimaryKey(policyInsuredId);
	}

	@Override
	public Boolean deletePolicyInsured(String policyInsuredId) throws Exception {
		return policyInsuredMapper.deleteByPrimaryKey(policyInsuredId)>0;
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