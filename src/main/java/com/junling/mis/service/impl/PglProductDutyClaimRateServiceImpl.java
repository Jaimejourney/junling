package com.junling.mis.service.impl;

import com.junling.mis.mapper.pglProductDutyClaimRateEntityMapper;
import com.junling.mis.model.pglProductDutyClaimRateEntity;
import com.junling.mis.service.PglProductDutyClaimRateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("pglProductDutyClaimRateService")
public class PglProductDutyClaimRateServiceImpl implements PglProductDutyClaimRateService {

	private final static Logger LOG = LoggerFactory.getLogger(PglProductDutyClaimRateServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.pglProductDutyClaimRateEntityMapper pglProductDutyClaimRateEntityMapper;

	@Override
	public Boolean addPglProductDutyClaimRate(pglProductDutyClaimRateEntity pglProductDutyClaimRateEntity) throws Exception {
		return pglProductDutyClaimRateEntityMapper.insert(pglProductDutyClaimRateEntity)>0;
	}

	@Override
	public Boolean updatePglProductDutyClaimRate(pglProductDutyClaimRateEntity pglProductDutyClaimRateEntity) throws Exception {
		return pglProductDutyClaimRateEntityMapper.updateByPrimaryKey(pglProductDutyClaimRateEntity) > 0;
	}

	@Override
	public pglProductDutyClaimRateEntity findDetailPglProductDutyClaimRate(String pglpdClaimRateId) throws Exception {
		return pglProductDutyClaimRateEntityMapper.selectByPrimaryKey(pglpdClaimRateId);
	}

	@Override
	public Boolean deletePglProductDutyClaimRate(String pglpdClaimRateId) throws Exception {
		return pglProductDutyClaimRateEntityMapper.deleteByPrimaryKey(pglpdClaimRateId) > 0;
	}

//	@Override
//	public Result addPglProductDutyClaimRate(PglProductDutyClaimRateModel pglProductDutyClaimRateModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updatePglProductDutyClaimRate(PglProductDutyClaimRateModel pglProductDutyClaimRateModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailPglProductDutyClaimRate(PglProductDutyClaimRateModel pglProductDutyClaimRateModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPglProductDutyClaimRate(PglProductDutyClaimRateModel pglProductDutyClaimRateModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPglProductDutyClaimRatePage(PglProductDutyClaimRateModel pglProductDutyClaimRateModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countPglProductDutyClaimRate(PglProductDutyClaimRateModel pglProductDutyClaimRateModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deletePglProductDutyClaimRate(PglProductDutyClaimRateModel pglProductDutyClaimRateModel) throws Exception{
//		return null;
//	}

}