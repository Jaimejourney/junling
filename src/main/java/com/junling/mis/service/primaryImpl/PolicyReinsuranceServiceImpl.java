package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.policyReinsurance;
import com.junling.mis.service.primary.PolicyReinsuranceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("policyReinsuranceService")
public class PolicyReinsuranceServiceImpl implements PolicyReinsuranceService {

	private final static Logger LOG = LoggerFactory.getLogger(PolicyReinsuranceServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.policyReinsuranceMapper policyReinsuranceMapper;

	@Override
	public Boolean addPolicyReinsurance(policyReinsurance policyReinsurance) throws Exception {
		return policyReinsuranceMapper.insert(policyReinsurance)>0;
	}

	@Override
	public Boolean updatePolicyReinsurance(policyReinsurance policyReinsurance) throws Exception {
		return policyReinsuranceMapper.updateByPrimaryKey(policyReinsurance)>0;
	}

	@Override
	public policyReinsurance findDetailPolicyReinsurance(String policyReinsuranceId) throws Exception {
		return policyReinsuranceMapper.selectByPrimaryKey(policyReinsuranceId);
	}

	@Override
	public Boolean deletePolicyReinsurance(String policyReinsuranceId) throws Exception {
		return policyReinsuranceMapper.deleteByPrimaryKey(policyReinsuranceId)>0;
	}

//	@Override
//	public Result addPolicyReinsurance(PolicyReinsuranceModel policyReinsuranceModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updatePolicyReinsurance(PolicyReinsuranceModel policyReinsuranceModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailPolicyReinsurance(PolicyReinsuranceModel policyReinsuranceModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyReinsurance(PolicyReinsuranceModel policyReinsuranceModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyReinsurancePage(PolicyReinsuranceModel policyReinsuranceModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countPolicyReinsurance(PolicyReinsuranceModel policyReinsuranceModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deletePolicyReinsurance(PolicyReinsuranceModel policyReinsuranceModel) throws Exception{
//		return null;
//	}

}