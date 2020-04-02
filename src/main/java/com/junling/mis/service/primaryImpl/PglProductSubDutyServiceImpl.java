package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.pglProdSubDutyMapper;
import com.junling.mis.model.primary.pglProdSubDuty;
import com.junling.mis.service.primary.PglProductSubDutyService;
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
	private pglProdSubDutyMapper pglProdSubDutyMapper;

	@Override
	public Boolean addPglProductSubDuty(pglProdSubDuty pglProductSubDuty) throws Exception {
		return pglProdSubDutyMapper.insert(pglProductSubDuty)>0;
	}

	@Override
	public Boolean updatePglProductSubDuty(pglProdSubDuty pglProductSubDuty) throws Exception {
		return pglProdSubDutyMapper.updateByPrimaryKey(pglProductSubDuty) > 0;
	}

	@Override
	public pglProdSubDuty findDetailPglProductSubDuty(String pglProductSubDutyId) throws Exception {
		return pglProdSubDutyMapper.selectByPrimaryKey(pglProductSubDutyId);
	}

	@Override
	public Boolean deletePglProductSubDuty(String pglProductSubDutyId) throws Exception {
		return pglProdSubDutyMapper.deleteByPrimaryKey(pglProductSubDutyId) > 0;
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