package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbDepartmentHospitalEntity;

;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbDepartmentHospitalService {

	Boolean addTbDepartmentHospital(tbDepartmentHospitalEntity tbDepartmentHospitalEntity) throws Exception;

	Boolean updateTbDepartmentHospital(tbDepartmentHospitalEntity tbDepartmentHospitalEntity) throws Exception;

	tbDepartmentHospitalEntity findDetailTbDepartmentHospital(Integer departmentId) throws Exception;
	
//	Result listTbDepartmentHospital(TbDepartmentHospitalModel tbDepartmentHospitalModel) throws Exception;
//
//    Result listTbDepartmentHospitalPage(TbDepartmentHospitalModel tbDepartmentHospitalModel) throws Exception;
//
//	Result countTbDepartmentHospital(TbDepartmentHospitalModel tbDepartmentHospitalModel) throws Exception;
	
	Boolean deleteTbDepartmentHospital(Integer departmentId) throws Exception;
}