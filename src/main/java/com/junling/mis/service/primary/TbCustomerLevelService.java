package com.junling.mis.service.primary;

import com.junling.mis.model.primary.TbCustomerLevel;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbCustomerLevelService {

	Boolean addTbCustomerLevel(TbCustomerLevel tbCustomerLevel) throws Exception;

	Boolean updateTbCustomerLevel(TbCustomerLevel tbCustomerLevel) throws Exception;

	TbCustomerLevel findDetailTbCustomerLevel(String customerLevelCode) throws Exception;
	
//	Result listTbCustomerLevel(TbCustomerLevelModel tbCustomerLevelModel) throws Exception;
//
//    Result listTbCustomerLevelPage(TbCustomerLevelModel tbCustomerLevelModel) throws Exception;
//
//	Result countTbCustomerLevel(TbCustomerLevelModel tbCustomerLevelModel) throws Exception;
	
	Boolean deleteTbCustomerLevel(String customerLevelCode) throws Exception;
}