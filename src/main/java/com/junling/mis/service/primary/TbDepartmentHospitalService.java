package com.junling.mis.service.primary;

import com.junling.mis.model.primary.TbHospitalDepartment;

;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbDepartmentHospitalService {

	Boolean addTbDepartmentHospital(TbHospitalDepartment tbHospitalDepartment) throws Exception;

	Boolean updateTbDepartmentHospital(TbHospitalDepartment tbHospitalDepartment) throws Exception;

	TbHospitalDepartment findDetailTbDepartmentHospital(String departmentId) throws Exception;
	
//	Result listTbDepartmentHospital(TbDepartmentHospitalModel tbDepartmentHospitalModel) throws Exception;
//
//    Result listTbDepartmentHospitalPage(TbDepartmentHospitalModel tbDepartmentHospitalModel) throws Exception;
//
//	Result countTbDepartmentHospital(TbDepartmentHospitalModel tbDepartmentHospitalModel) throws Exception;
	
	Boolean deleteTbDepartmentHospital(String departmentId) throws Exception;
}