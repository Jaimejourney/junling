package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbBaseHospitalYaofangEntity;
import com.junling.mis.model.primary.tbBaseHospitalYaofangEntityWithBLOBs;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbBaseHospitalYaofangService {

	Boolean addTbBaseHospitalYaofang(tbBaseHospitalYaofangEntityWithBLOBs tbBaseHospitalYaofangEntityWithBLOBs) throws Exception;

	Boolean updateTbBaseHospitalYaofang(tbBaseHospitalYaofangEntityWithBLOBs tbBaseHospitalYaofangEntityWithBLOBs) throws Exception;

	tbBaseHospitalYaofangEntityWithBLOBs findDetailTbBaseHospitalYaofang(String hospitalId) throws Exception;
	
//	Result listTbBaseHospitalYaofang(TbBaseHospitalYaofangModel tbBaseHospitalYaofangModel) throws Exception;
//
//    Result listTbBaseHospitalYaofangPage(TbBaseHospitalYaofangModel tbBaseHospitalYaofangModel) throws Exception;
//
//	Result countTbBaseHospitalYaofang(TbBaseHospitalYaofangModel tbBaseHospitalYaofangModel) throws Exception;
	
	Boolean deleteTbBaseHospitalYaofang(String hospitalId) throws Exception;
}