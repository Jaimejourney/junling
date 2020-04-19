package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.PolicyGradeLevelProMapper;
import com.junling.mis.model.primary.PolicyGradeLevelPro;
import com.junling.mis.service.primary.PolicyGradeLevelProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("policyGradeLevelProductService")
public class PolicyGradeLevelProductServiceImpl implements PolicyGradeLevelProductService {

	private final static Logger LOG = LoggerFactory.getLogger(PolicyGradeLevelProductServiceImpl.class);

	@Resource
	private PolicyGradeLevelProMapper policyGradeLevelProMapper;

	@Override
	public Boolean addPolicyGradeLevelProduct(PolicyGradeLevelPro policyGradeLevelProduct) throws Exception {
		return policyGradeLevelProMapper.insert(policyGradeLevelProduct)>0;
	}

	@Override
	public Boolean updatePolicyGradeLevelProduct(PolicyGradeLevelPro policyGradeLevelProduct) throws Exception {
		return policyGradeLevelProMapper.updateByPrimaryKey(policyGradeLevelProduct) > 0;
	}

	@Override
	public PolicyGradeLevelPro findDetailPolicyGradeLevelProduct(String pglProductId) throws Exception {
		return policyGradeLevelProMapper.selectByPrimaryKey(pglProductId);
	}

	@Override
	public Boolean deletePolicyGradeLevelProduct(String pglProductId) throws Exception {
		return policyGradeLevelProMapper.deleteByPrimaryKey(pglProductId)>0;
	}

//	@Override
//	public Result addPolicyGradeLevelProduct(PolicyGradeLevelProductModel policyGradeLevelProductModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updatePolicyGradeLevelProduct(PolicyGradeLevelProductModel policyGradeLevelProductModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailPolicyGradeLevelProduct(PolicyGradeLevelProductModel policyGradeLevelProductModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyGradeLevelProduct(PolicyGradeLevelProductModel policyGradeLevelProductModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPolicyGradeLevelProductPage(PolicyGradeLevelProductModel policyGradeLevelProductModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countPolicyGradeLevelProduct(PolicyGradeLevelProductModel policyGradeLevelProductModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deletePolicyGradeLevelProduct(PolicyGradeLevelProductModel policyGradeLevelProductModel) throws Exception{
//		return null;
//	}

}