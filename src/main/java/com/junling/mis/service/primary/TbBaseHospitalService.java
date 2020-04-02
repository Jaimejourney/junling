package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbBaseHospital;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbBaseHospitalService {

	Boolean addTbBaseHospital(tbBaseHospital tbBaseHospital) throws Exception;

	Boolean updateTbBaseHospital(tbBaseHospital tbBaseHospital) throws Exception;

	tbBaseHospital findDetailTbBaseHospital(String hospitalId) throws Exception;
	
//	Result listTbBaseHospital(TbBaseHospitalModel tbBaseHospitalModel) throws Exception;
//
//    Result listTbBaseHospitalPage(TbBaseHospitalModel tbBaseHospitalModel) throws Exception;
//
//	Result countTbBaseHospital(TbBaseHospitalModel tbBaseHospitalModel) throws Exception;
	
	Boolean deleteTbBaseHospital(String hospitalId) throws Exception;
}