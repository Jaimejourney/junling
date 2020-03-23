package com.junling.mis.service.impl;

import com.junling.mis.mapper.pglProductSubDutyEntityMapper;
import com.junling.mis.model.pglProductSubDutyEntity;
import com.junling.mis.service.PglProductSubDutyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("pglProductSubDutyService")
public class PglProductSubDutyServiceImpl implements PglProductSubDutyService {

	private final static Logger LOG = LoggerFactory.getLogger(PglProductSubDutyServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.pglProductSubDutyEntityMapper pglProductSubDutyEntityMapper;

	@Override
	public Boolean addPglProductSubDuty(pglProductSubDutyEntity pglProductSubDutyEntity) throws Exception {
		return pglProductSubDutyEntityMapper.insert(pglProductSubDutyEntity)>0;
	}

	@Override
	public Boolean updatePglProductSubDuty(pglProductSubDutyEntity pglProductSubDutyEntity) throws Exception {
		return pglProductSubDutyEntityMapper.updateByPrimaryKey(pglProductSubDutyEntity) > 0;
	}

	@Override
	public pglProductSubDutyEntity findDetailPglProductSubDuty(String pglProductSubDutyId) throws Exception {
		return pglProductSubDutyEntityMapper.selectByPrimaryKey(pglProductSubDutyId);
	}

	@Override
	public Boolean deletePglProductSubDuty(String pglProductSubDutyId) throws Exception {
		return pglProductSubDutyEntityMapper.deleteByPrimaryKey(pglProductSubDutyId) > 0;
	}
//
//	@Override
//	public Result addPglProductSubDuty(PglProductSubDutyModel pglProductSubDutyModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updatePglProductSubDuty(PglProductSubDutyModel pglProductSubDutyModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailPglProductSubDuty(PglProductSubDutyModel pglProductSubDutyModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPglProductSubDuty(PglProductSubDutyModel pglProductSubDutyModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPglProductSubDutyPage(PglProductSubDutyModel pglProductSubDutyModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countPglProductSubDuty(PglProductSubDutyModel pglProductSubDutyModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deletePglProductSubDuty(PglProductSubDutyModel pglProductSubDutyModel) throws Exception{
//		return null;
//	}

}