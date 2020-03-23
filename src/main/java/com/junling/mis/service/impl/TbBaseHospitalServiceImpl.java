package com.junling.mis.service.impl;

import com.junling.mis.mapper.tbBaseHospitalEntityMapper;
import com.junling.mis.model.tbBaseHospitalEntity;
import com.junling.mis.model.tbBaseHospitalEntityWithBLOBs;
import com.junling.mis.service.TbBaseHospitalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbBaseHospitalService")
public class TbBaseHospitalServiceImpl implements TbBaseHospitalService {

	private final static Logger LOG = LoggerFactory.getLogger(TbBaseHospitalServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.tbBaseHospitalEntityMapper tbBaseHospitalEntityMapper;

	@Override
	public Boolean addTbBaseHospital(tbBaseHospitalEntityWithBLOBs tbBaseHospitalEntityWithBLOBs) throws Exception {
		return tbBaseHospitalEntityMapper.insert(tbBaseHospitalEntityWithBLOBs)>0;
	}

	@Override
	public Boolean updateTbBaseHospital(tbBaseHospitalEntityWithBLOBs tbBaseHospitalEntityWithBLOBs) throws Exception {
		return tbBaseHospitalEntityMapper.updateByPrimaryKey(tbBaseHospitalEntityWithBLOBs)>0;
	}

	@Override
	public tbBaseHospitalEntityWithBLOBs findDetailTbBaseHospital(String hospitalId) throws Exception {
		return tbBaseHospitalEntityMapper.selectByPrimaryKey(hospitalId);
	}

	@Override
	public Boolean deleteTbBaseHospital(String hospitalId) throws Exception {
		return tbBaseHospitalEntityMapper.deleteByPrimaryKey(hospitalId)>0;
	}


//	@Override
//	public Result addTbBaseHospital(TbBaseHospitalModel tbBaseHospitalModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbBaseHospital(TbBaseHospitalModel tbBaseHospitalModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbBaseHospital(TbBaseHospitalModel tbBaseHospitalModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbBaseHospital(TbBaseHospitalModel tbBaseHospitalModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbBaseHospitalPage(TbBaseHospitalModel tbBaseHospitalModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbBaseHospital(TbBaseHospitalModel tbBaseHospitalModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbBaseHospital(TbBaseHospitalModel tbBaseHospitalModel) throws Exception{
//		return null;
//	}

}