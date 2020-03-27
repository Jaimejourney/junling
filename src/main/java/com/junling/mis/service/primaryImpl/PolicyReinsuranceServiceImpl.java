package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.policyReinsuranceEntity;
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
	private com.junling.mis.mapper.primary.policyReinsuranceEntityMapper policyReinsuranceEntityMapper;

	@Override
	public Boolean addPolicyReinsurance(policyReinsuranceEntity policyReinsuranceEntity) throws Exception {
		return policyReinsuranceEntityMapper.insert(policyReinsuranceEntity)>0;
	}

	@Override
	public Boolean updatePolicyReinsurance(policyReinsuranceEntity policyReinsuranceEntity) throws Exception {
		return policyReinsuranceEntityMapper.updateByPrimaryKey(policyReinsuranceEntity)>0;
	}

	@Override
	public policyReinsuranceEntity findDetailPolicyReinsurance(String policyReinsuranceId) throws Exception {
		return policyReinsuranceEntityMapper.selectByPrimaryKey(policyReinsuranceId);
	}

	@Override
	public Boolean deletePolicyReinsurance(String policyReinsuranceId) throws Exception {
		return policyReinsuranceEntityMapper.deleteByPrimaryKey(policyReinsuranceId)>0;
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