package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbHospitalDepartment;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbHospitalDepartmentService {

	Boolean addTbHospitalDepartment(tbHospitalDepartment tbHospitalDepartment) throws Exception;

	Boolean updateTbHospitalDepartment(tbHospitalDepartment tbHospitalDepartment) throws Exception;

	tbHospitalDepartment findDetailTbHospitalDepartment(String hospitalDepartmentId) throws Exception;
	
//	Result listTbHospitalDepartment(TbHospitalDepartmentModel tbHospitalDepartmentModel) throws Exception;
//
//    Result listTbHospitalDepartmentPage(TbHospitalDepartmentModel tbHospitalDepartmentModel) throws Exception;
//
//	Result countTbHospitalDepartment(TbHospitalDepartmentModel tbHospitalDepartmentModel) throws Exception;
//
	Boolean deleteTbHospitalDepartment(String hospitalDepartmentId) throws Exception;
}