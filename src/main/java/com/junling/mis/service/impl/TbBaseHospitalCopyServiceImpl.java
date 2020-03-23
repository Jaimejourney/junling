package com.junling.mis.service.impl;

import com.junling.mis.mapper.tbBaseHospitalCopyEntityMapper;
import com.junling.mis.model.tbBaseHospitalCopyEntity;
import com.junling.mis.service.TbBaseHospitalCopyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbBaseHospitalCopyService")
public class TbBaseHospitalCopyServiceImpl implements TbBaseHospitalCopyService {

	private final static Logger LOG = LoggerFactory.getLogger(TbBaseHospitalCopyServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.tbBaseHospitalCopyEntityMapper tbBaseHospitalCopyEntityMapper;

	@Override
	public Boolean addTbBaseHospitalCopy(tbBaseHospitalCopyEntity tbBaseHospitalCopyEntity) throws Exception {
		return tbBaseHospitalCopyEntityMapper.insert(tbBaseHospitalCopyEntity)>0;
	}

	@Override
	public Boolean updateTbBaseHospitalCopy(tbBaseHospitalCopyEntity tbBaseHospitalCopyEntity) throws Exception {
		return tbBaseHospitalCopyEntityMapper.updateByPrimaryKey(tbBaseHospitalCopyEntity)>0;
	}

	@Override
	public tbBaseHospitalCopyEntity findDetailTbBaseHospitalCopy(Integer hospitalId) throws Exception {
		return tbBaseHospitalCopyEntityMapper.selectByPrimaryKey(hospitalId);
	}

	@Override
	public Boolean deleteTbBaseHospitalCopy(Integer hospitalId) throws Exception {
		return tbBaseHospitalCopyEntityMapper.deleteByPrimaryKey(hospitalId)>0;
	}

//	@Override
//	public Result addTbBaseHospitalCopy(TbBaseHospitalCopyModel tbBaseHospitalCopyModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbBaseHospitalCopy(TbBaseHospitalCopyModel tbBaseHospitalCopyModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbBaseHospitalCopy(TbBaseHospitalCopyModel tbBaseHospitalCopyModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbBaseHospitalCopy(TbBaseHospitalCopyModel tbBaseHospitalCopyModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbBaseHospitalCopyPage(TbBaseHospitalCopyModel tbBaseHospitalCopyModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbBaseHospitalCopy(TbBaseHospitalCopyModel tbBaseHospitalCopyModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbBaseHospitalCopy(TbBaseHospitalCopyModel tbBaseHospitalCopyModel) throws Exception{
//		return null;
//	}

}