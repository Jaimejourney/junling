package com.junling.mis.service.primaryImpl;

import com.junling.mis.mapper.primary.TbHospitalDepartmentMapper;
import com.junling.mis.model.primary.TbHospitalDepartment;
import com.junling.mis.service.primary.TbDepartmentHospitalService;
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
	private TbHospitalDepartmentMapper tbHospitalDepartmentMapper;

	@Override
	public Boolean addTbDepartmentHospital(TbHospitalDepartment tbHospitalDepartment) throws Exception {
		return tbHospitalDepartmentMapper.insert(tbHospitalDepartment) > 0;
	}

	@Override
	public Boolean updateTbDepartmentHospital(TbHospitalDepartment tbHospitalDepartment) throws Exception {
		return tbHospitalDepartmentMapper.updateByPrimaryKey(tbHospitalDepartment)>0;
	}

	@Override
	public TbHospitalDepartment findDetailTbDepartmentHospital(String departmentId) throws Exception {
		return tbHospitalDepartmentMapper.selectByPrimaryKey(departmentId);
	}

	@Override
	public Boolean deleteTbDepartmentHospital(String departmentId) throws Exception {
		return tbHospitalDepartmentMapper.deleteByPrimaryKey(departmentId) > 0;
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