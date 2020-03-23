package com.junling.mis.service.impl;

import com.junling.mis.mapper.pglProductDutyEntityMapper;
import com.junling.mis.model.pglProductDutyEntity;
import com.junling.mis.service.PglProductDutyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
@Service("pglProductDutyService")
public class PglProductDutyServiceImpl implements PglProductDutyService {

	private final static Logger LOG = LoggerFactory.getLogger(PglProductDutyServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.pglProductDutyEntityMapper pglProductDutyEntityMapper;

	@Override
	public Boolean addPglProductDuty(pglProductDutyEntity pglProductDutyEntity) throws Exception {
		return pglProductDutyEntityMapper.insert(pglProductDutyEntity) > 0;
	}

	@Override
	public Boolean updatePglProductDuty(pglProductDutyEntity pglProductDutyEntity) throws Exception {
		return pglProductDutyEntityMapper.updateByPrimaryKey(pglProductDutyEntity) > 0;
	}

	@Override
	public pglProductDutyEntity findDetailPglProductDuty(String pglProductDutyId) throws Exception {
		return pglProductDutyEntityMapper.selectByPrimaryKey(pglProductDutyId);
	}

	@Override
	public Boolean deletePglProductDuty(String pglProductDutyId) throws Exception {
		return pglProductDutyEntityMapper.deleteByPrimaryKey(pglProductDutyId)>0;
	}

//	@Override
//	public Result addPglProductDuty(PglProductDutyModel pglProductDutyModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updatePglProductDuty(PglProductDutyModel pglProductDutyModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailPglProductDuty(PglProductDutyModel pglProductDutyModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPglProductDuty(PglProductDutyModel pglProductDutyModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listPglProductDutyPage(PglProductDutyModel pglProductDutyModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countPglProductDuty(PglProductDutyModel pglProductDutyModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deletePglProductDuty(PglProductDutyModel pglProductDutyModel) throws Exception{
//		return null;
//	}

}