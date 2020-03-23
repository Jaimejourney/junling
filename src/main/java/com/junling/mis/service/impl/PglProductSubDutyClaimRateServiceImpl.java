package com.junling.mis.service.impl;

import com.junling.mis.mapper.pglProductSubDutyClaimRateEntityMapper;
import com.junling.mis.model.pglProductSubDutyClaimRateEntity;
import com.junling.mis.service.PglProductSubDutyClaimRateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("pglProductSubDutyClaimRateService")
public class PglProductSubDutyClaimRateServiceImpl implements PglProductSubDutyClaimRateService {

	private final static Logger LOG = LoggerFactory.getLogger(PglProductSubDutyClaimRateServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.pglProductSubDutyClaimRateEntityMapper pglProductSubDutyClaimRateEntityMapper;

	@Override
	public Boolean addPglProductSubDutyClaimRate(pglProductSubDutyClaimRateEntity pglProductSubDutyClaimRateEntity) throws Exception {
		return pglProductSubDutyClaimRateEntityMapper.insert(pglProductSubDutyClaimRateEntity) > 0;
	}

	@Override
	public Boolean updatePglProductSubDutyClaimRate(pglProductSubDutyClaimRateEntity pglProductSubDutyClaimRateEntity) throws Exception {
		return pglProductSubDutyClaimRateEntityMapper.updateByPrimaryKey(pglProductSubDutyClaimRateEntity) > 0;
	}

	@Override
	public pglProductSubDutyClaimRateEntity findDetailPglProductSubDutyClaimRate(String pglpsdClaimRateId) throws Exception {
		return pglProductSubDutyClaimRateEntityMapper.selectByPrimaryKey(pglpsdClaimRateId);
	}

	@Override
	public Boolean deletePglProductSubDutyClaimRate(String pglpsdClaimRateId) throws Exception {
		return pglProductSubDutyClaimRateEntityMapper.deleteByPrimaryKey(pglpsdClaimRateId)>0;
	}

//	@Override
//	public Result addPglProductSubDutyClaimRate(PglProductSubDutyClaimRateModel pglProductSubDutyClaimRateModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updatePglProductSubDutyClaimRate(PglProductSubDutyClaimRateModel pglProductSubDutyClaimRateModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailPglProductSubDutyClaimRate(PglProductSubDutyClaimRateModel pglProductSubDutyClaimRateModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPglProductSubDutyClaimRate(PglProductSubDutyClaimRateModel pglProductSubDutyClaimRateModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPglProductSubDutyClaimRatePage(PglProductSubDutyClaimRateModel pglProductSubDutyClaimRateModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countPglProductSubDutyClaimRate(PglProductSubDutyClaimRateModel pglProductSubDutyClaimRateModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deletePglProductSubDutyClaimRate(PglProductSubDutyClaimRateModel pglProductSubDutyClaimRateModel) throws Exception{
//		return null;
//	}

}