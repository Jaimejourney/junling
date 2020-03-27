package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbCustomerLevelEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbCustomerLevelService {

	Boolean addTbCustomerLevel(tbCustomerLevelEntity tbCustomerLevelEntity) throws Exception;

	Boolean updateTbCustomerLevel(tbCustomerLevelEntity tbCustomerLevelEntity) throws Exception;

	tbCustomerLevelEntity findDetailTbCustomerLevel(String customerLevelCode) throws Exception;
	
//	Result listTbCustomerLevel(TbCustomerLevelModel tbCustomerLevelModel) throws Exception;
//
//    Result listTbCustomerLevelPage(TbCustomerLevelModel tbCustomerLevelModel) throws Exception;
//
//	Result countTbCustomerLevel(TbCustomerLevelModel tbCustomerLevelModel) throws Exception;
	
	Boolean deleteTbCustomerLevel(String customerLevelCode) throws Exception;
}