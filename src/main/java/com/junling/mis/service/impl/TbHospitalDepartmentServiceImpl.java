package com.junling.mis.service.impl;

import com.junling.mis.mapper.tbHospitalDepartmentEntityMapper;
import com.junling.mis.model.tbHospitalDepartmentEntity;
import com.junling.mis.service.TbHospitalDepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("tbHospitalDepartmentService")
public class TbHospitalDepartmentServiceImpl implements TbHospitalDepartmentService {

	private final static Logger LOG = LoggerFactory.getLogger(TbHospitalDepartmentServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.tbHospitalDepartmentEntityMapper tbHospitalDepartmentEntityMapper;

	@Override
	public Boolean addTbHospitalDepartment(tbHospitalDepartmentEntity tbHospitalDepartmentEntity) throws Exception {
		return tbHospitalDepartmentEntityMapper.insert(tbHospitalDepartmentEntity)>0;
	}

	@Override
	public Boolean updateTbHospitalDepartment(tbHospitalDepartmentEntity tbHospitalDepartmentEntity) throws Exception {
		return tbHospitalDepartmentEntityMapper.updateByPrimaryKey(tbHospitalDepartmentEntity)>0;
	}

	@Override
	public tbHospitalDepartmentEntity findDetailTbHospitalDepartment(String hospitalDepartmentId) throws Exception {
		return tbHospitalDepartmentEntityMapper.selectByPrimaryKey(hospitalDepartmentId);
	}

	@Override
	public Boolean deleteTbHospitalDepartment(String hospitalDepartmentId) throws Exception {
		return tbHospitalDepartmentEntityMapper.deleteByPrimaryKey(hospitalDepartmentId)>0;
	}

//	@Override
//	public Result addTbHospitalDepartment(TbHospitalDepartmentModel tbHospitalDepartmentModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateTbHospitalDepartment(TbHospitalDepartmentModel tbHospitalDepartmentModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailTbHospitalDepartment(TbHospitalDepartmentModel tbHospitalDepartmentModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbHospitalDepartment(TbHospitalDepartmentModel tbHospitalDepartmentModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listTbHospitalDepartmentPage(TbHospitalDepartmentModel tbHospitalDepartmentModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countTbHospitalDepartment(TbHospitalDepartmentModel tbHospitalDepartmentModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteTbHospitalDepartment(TbHospitalDepartmentModel tbHospitalDepartmentModel) throws Exception{
//		return null;
//	}

}