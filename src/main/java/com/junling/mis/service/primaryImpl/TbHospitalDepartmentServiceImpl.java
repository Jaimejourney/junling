package com.junling.mis.service.primaryImpl;

import com.junling.mis.model.primary.tbHospitalDepartment;
import com.junling.mis.service.primary.TbHospitalDepartmentService;
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
	private com.junling.mis.mapper.primary.tbHospitalDepartmentMapper tbHospitalDepartmentMapper;

	@Override
	public Boolean addTbHospitalDepartment(tbHospitalDepartment tbHospitalDepartment) throws Exception {
		return tbHospitalDepartmentMapper.insert(tbHospitalDepartment)>0;
	}

	@Override
	public Boolean updateTbHospitalDepartment(tbHospitalDepartment tbHospitalDepartment) throws Exception {
		return tbHospitalDepartmentMapper.updateByPrimaryKey(tbHospitalDepartment)>0;
	}

	@Override
	public tbHospitalDepartment findDetailTbHospitalDepartment(String hospitalDepartmentId) throws Exception {
		return tbHospitalDepartmentMapper.selectByPrimaryKey(hospitalDepartmentId);
	}

	@Override
	public Boolean deleteTbHospitalDepartment(String hospitalDepartmentId) throws Exception {
		return tbHospitalDepartmentMapper.deleteByPrimaryKey(hospitalDepartmentId)>0;
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