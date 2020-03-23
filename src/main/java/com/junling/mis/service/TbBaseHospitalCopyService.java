package com.junling.mis.service;

import com.junling.mis.model.tbBaseHospitalCopyEntity;

;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbBaseHospitalCopyService {

	Boolean addTbBaseHospitalCopy(tbBaseHospitalCopyEntity tbBaseHospitalCopyEntity) throws Exception;

	Boolean updateTbBaseHospitalCopy(tbBaseHospitalCopyEntity tbBaseHospitalCopyEntity) throws Exception;

	tbBaseHospitalCopyEntity findDetailTbBaseHospitalCopy(Integer hospitalId) throws Exception;
	
//	Result listTbBaseHospitalCopy(TbBaseHospitalCopyModel tbBaseHospitalCopyModel) throws Exception;
//
//    Result listTbBaseHospitalCopyPage(TbBaseHospitalCopyModel tbBaseHospitalCopyModel) throws Exception;
//
//	Result countTbBaseHospitalCopy(TbBaseHospitalCopyModel tbBaseHospitalCopyModel) throws Exception;
//
	Boolean deleteTbBaseHospitalCopy(Integer hospitalId) throws Exception;
}