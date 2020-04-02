package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.policyGradeLevel;
import com.junling.mis.service.primary.PolicyGradeLevelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("policyGradeLevelService")
public class PolicyGradeLevelServiceImpl implements PolicyGradeLevelService {

	private final static Logger LOG = LoggerFactory.getLogger(PolicyGradeLevelServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.primary.policyGradeLevelMapper policyGradeLevelMapper;

	@Override
	public Boolean addPolicyGradeLevel(policyGradeLevel policyGradeLevel) throws Exception {
		return policyGradeLevelMapper.insert(policyGradeLevel)>0;
	}

	@Override
	public Boolean updatePolicyGradeLevel(policyGradeLevel policyGradeLevel) throws Exception {
		return policyGradeLevelMapper.updateByPrimaryKey(policyGradeLevel)>0;
	}

	@Override
	public policyGradeLevel findDetailPolicyGradeLevel(String policyGradeLevelId) throws Exception {
		return policyGradeLevelMapper.selectByPrimaryKey(policyGradeLevelId);
	}

	@Override
	public Boolean deletePolicyGradeLevel(String policyGradeLevelId) throws Exception {
		return policyGradeLevelMapper.deleteByPrimaryKey(policyGradeLevelId)>0;
	}

//	@Override
//	public Result addPolicyGradeLevel(PolicyGradeLevelModel policyGradeLevelModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updatePolicyGradeLevel(PolicyGradeLevelModel policyGradeLevelModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailPolicyGradeLevel(PolicyGradeLevelModel policyGradeLevelModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyGradeLevel(PolicyGradeLevelModel policyGradeLevelModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyGradeLevelPage(PolicyGradeLevelModel policyGradeLevelModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countPolicyGradeLevel(PolicyGradeLevelModel policyGradeLevelModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deletePolicyGradeLevel(PolicyGradeLevelModel policyGradeLevelModel) throws Exception{
//		return null;
//	}

}