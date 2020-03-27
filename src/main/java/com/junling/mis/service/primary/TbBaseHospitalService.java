package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbBaseHospitalEntity;
import com.junling.mis.model.primary.tbBaseHospitalEntityWithBLOBs;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbBaseHospitalService {

	Boolean addTbBaseHospital(tbBaseHospitalEntityWithBLOBs tbBaseHospitalEntityWithBLOBs) throws Exception;

	Boolean updateTbBaseHospital(tbBaseHospitalEntityWithBLOBs tbBaseHospitalEntityWithBLOBs) throws Exception;

	tbBaseHospitalEntityWithBLOBs findDetailTbBaseHospital(String hospitalId) throws Exception;
	
//	Result listTbBaseHospital(TbBaseHospitalModel tbBaseHospitalModel) throws Exception;
//
//    Result listTbBaseHospitalPage(TbBaseHospitalModel tbBaseHospitalModel) throws Exception;
//
//	Result countTbBaseHospital(TbBaseHospitalModel tbBaseHospitalModel) throws Exception;
	
	Boolean deleteTbBaseHospital(String hospitalId) throws Exception;
}