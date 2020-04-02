package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.pglProductDuty;
import com.junling.mis.service.primary.PglProductDutyService;
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
	private com.junling.mis.mapper.primary.pglProductDutyMapper pglProductDutyMapper;

	@Override
	public Boolean addPglProductDuty(pglProductDuty pglProductDuty) throws Exception {
		return pglProductDutyMapper.insert(pglProductDuty) > 0;
	}

	@Override
	public Boolean updatePglProductDuty(pglProductDuty pglProductDuty) throws Exception {
		return pglProductDutyMapper.updateByPrimaryKey(pglProductDuty) > 0;
	}

	@Override
	public pglProductDuty findDetailPglProductDuty(String pglProductDutyId) throws Exception {
		return pglProductDutyMapper.selectByPrimaryKey(pglProductDutyId);
	}

	@Override
	public Boolean deletePglProductDuty(String pglProductDutyId) throws Exception {
		return pglProductDutyMapper.deleteByPrimaryKey(pglProductDutyId)>0;
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