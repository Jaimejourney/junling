package com.junling.mis.service.impl;

import com.junling.mis.mapper.tbDepartmentHospitalEntityMapper;
import com.junling.mis.model.tbDepartmentHospitalEntity;
import com.junling.mis.service.TbDepartmentHospitalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbDepartmentHospitalService")
public class TbDepartmentHospitalServiceImpl implements TbDepartmentHospitalService {

	private final static Logger LOG = LoggerFactory.getLogger(TbDepartmentHospitalServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.tbDepartmentHospitalEntityMapper tbDepartmentHospitalEntityMapper;

	@Override
	public Boolean addTbDepartmentHospital(tbDepartmentHospitalEntity tbDepartmentHospitalEntity) throws Exception {
		return tbDepartmentHospitalEntityMapper.insert(tbDepartmentHospitalEntity) > 0;
	}

	@Override
	public Boolean updateTbDepartmentHospital(tbDepartmentHospitalEntity tbDepartmentHospitalEntity) throws Exception {
		return tbDepartmentHospitalEntityMapper.updateByPrimaryKey(tbDepartmentHospitalEntity)>0;
	}

	@Override
	public tbDepartmentHospitalEntity findDetailTbDepartmentHospital(Integer departmentId) throws Exception {
		return tbDepartmentHospitalEntityMapper.selectByPrimaryKey(departmentId);
	}

	@Override
	public Boolean deleteTbDepartmentHospital(Integer departmentId) throws Exception {
		return tbDepartmentHospitalEntityMapper.deleteByPrimaryKey(departmentId) > 0;
	}


//	@Override
//	public Result addTbDepartmentHospital(TbDepartmentHospitalModel tbDepartmentHospitalModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbDepartmentHospital(TbDepartmentHospitalModel tbDepartmentHospitalModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbDepartmentHospital(TbDepartmentHospitalModel tbDepartmentHospitalModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbDepartmentHospital(TbDepartmentHospitalModel tbDepartmentHospitalModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbDepartmentHospitalPage(TbDepartmentHospitalModel tbDepartmentHospitalModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbDepartmentHospital(TbDepartmentHospitalModel tbDepartmentHospitalModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbDepartmentHospital(TbDepartmentHospitalModel tbDepartmentHospitalModel) throws Exception{
//		return null;
//	}

}