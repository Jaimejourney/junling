package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.policyInfoEntity;
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
	private com.junling.mis.mapper.primary.policyInfoEntityMapper policyInfoEntityMapper;

	@Override
	public Boolean addPolicyInfo(policyInfoEntity policyInfoEntity) throws Exception {
		return policyInfoEntityMapper.insert(policyInfoEntity) > 0;
	}

	@Override
	public Boolean updatePolicyInfo(policyInfoEntity policyInfoEntity) throws Exception {
		return policyInfoEntityMapper.updateByPrimaryKey(policyInfoEntity) > 0;
	}

	@Override
	public policyInfoEntity findDetailPolicyInfo(String policyInfoId) throws Exception {
		return policyInfoEntityMapper.selectByPrimaryKey(policyInfoId);
	}

	@Override
	public Boolean deletePolicyInfo(String policyInfoId) throws Exception {
		return policyInfoEntityMapper.deleteByPrimaryKey(policyInfoId) > 0;
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