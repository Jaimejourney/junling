package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbHospitalDepartmentEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbHospitalDepartmentService {

	Boolean addTbHospitalDepartment(tbHospitalDepartmentEntity tbHospitalDepartmentEntity) throws Exception;

	Boolean updateTbHospitalDepartment(tbHospitalDepartmentEntity tbHospitalDepartmentEntity) throws Exception;

	tbHospitalDepartmentEntity findDetailTbHospitalDepartment(String hospitalDepartmentId) throws Exception;
	
//	Result listTbHospitalDepartment(TbHospitalDepartmentModel tbHospitalDepartmentModel) throws Exception;
//
//    Result listTbHospitalDepartmentPage(TbHospitalDepartmentModel tbHospitalDepartmentModel) throws Exception;
//
//	Result countTbHospitalDepartment(TbHospitalDepartmentModel tbHospitalDepartmentModel) throws Exception;
//
	Boolean deleteTbHospitalDepartment(String hospitalDepartmentId) throws Exception;
}