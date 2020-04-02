package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.policyInfo;
import com.junling.mis.service.primary.PolicyInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("policyInfoService")
public class PolicyInfoServiceImpl implements PolicyInfoService {

	private final static Logger LOG = LoggerFactory.getLogger(PolicyInfoServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.policyInfoMapper policyInfoMapper;

	@Override
	public Boolean addPolicyInfo(policyInfo policyInfo) throws Exception {
		return policyInfoMapper.insert(policyInfo) > 0;
	}

	@Override
	public Boolean updatePolicyInfo(policyInfo policyInfo) throws Exception {
		return policyInfoMapper.updateByPrimaryKey(policyInfo) > 0;
	}

	@Override
	public policyInfo findDetailPolicyInfo(String policyInfoId) throws Exception {
		return policyInfoMapper.selectByPrimaryKey(policyInfoId);
	}

	@Override
	public Boolean deletePolicyInfo(String policyInfoId) throws Exception {
		return policyInfoMapper.deleteByPrimaryKey(policyInfoId) > 0;
	}

//	@Override
//	public Result addPolicyInfo(PolicyInfoModel policyInfoModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updatePolicyInfo(PolicyInfoModel policyInfoModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailPolicyInfo(PolicyInfoModel policyInfoModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyInfo(PolicyInfoModel policyInfoModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyInfoPage(PolicyInfoModel policyInfoModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countPolicyInfo(PolicyInfoModel policyInfoModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deletePolicyInfo(PolicyInfoModel policyInfoModel) throws Exception{
//		return null;
//	}

}