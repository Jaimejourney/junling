package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.pglpdClaimRateMapper;
import com.junling.mis.model.primary.pglpdClaimRate;
import com.junling.mis.service.primary.PglProductDutyClaimRateService;
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
	private pglpdClaimRateMapper pglpdClaimRateMapper;


	@Override
	public Boolean addPglProductDutyClaimRate(pglpdClaimRate pglProductDutyClaimRate) throws Exception {
		return pglpdClaimRateMapper.insert(pglProductDutyClaimRate) > 0;
	}

	@Override
	public Boolean updatePglProductDutyClaimRate(pglpdClaimRate pglProductDutyClaimRate) throws Exception {
		return pglpdClaimRateMapper.updateByPrimaryKey(pglProductDutyClaimRate) > 0;
	}

	@Override
	public pglpdClaimRate findDetailPglProductDutyClaimRate(String pglpdClaimRateId) throws Exception {
		return pglpdClaimRateMapper.selectByPrimaryKey(pglpdClaimRateId);
	}

	@Override
	public Boolean deletePglProductDutyClaimRate(String pglpdClaimRateId) throws Exception {
		return pglpdClaimRateMapper.deleteByPrimaryKey(pglpdClaimRateId) > 0;
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