package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.policyGradeLevelEntity;
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
	private com.junling.mis.mapper.primary.policyGradeLevelEntityMapper policyGradeLevelEntityMapper;

	@Override
	public Boolean addPolicyGradeLevel(policyGradeLevelEntity policyGradeLevelEntity) throws Exception {
		return policyGradeLevelEntityMapper.insert(policyGradeLevelEntity)>0;
	}

	@Override
	public Boolean updatePolicyGradeLevel(policyGradeLevelEntity policyGradeLevelEntity) throws Exception {
		return policyGradeLevelEntityMapper.updateByPrimaryKey(policyGradeLevelEntity)>0;
	}

	@Override
	public policyGradeLevelEntity findDetailPolicyGradeLevel(String policyGradeLevelId) throws Exception {
		return policyGradeLevelEntityMapper.selectByPrimaryKey(policyGradeLevelId);
	}

	@Override
	public Boolean deletePolicyGradeLevel(String policyGradeLevelId) throws Exception {
		return policyGradeLevelEntityMapper.deleteByPrimaryKey(policyGradeLevelId)>0;
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