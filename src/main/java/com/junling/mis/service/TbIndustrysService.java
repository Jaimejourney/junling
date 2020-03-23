package com.junling.mis.service;

import com.junling.mis.model.tbIndustrysEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbIndustrysService {

	Boolean addTbIndustrys(tbIndustrysEntity tbIndustrysEntity) throws Exception;

	Boolean updateTbIndustrys(tbIndustrysEntity tbIndustrysEntity) throws Exception;

	tbIndustrysEntity findDetailTbIndustrys(String industryTypeCode) throws Exception;
	
//	Result listTbIndustrys(TbIndustrysModel tbIndustrysModel) throws Exception;
//
//    Result listTbIndustrysPage(TbIndustrysModel tbIndustrysModel) throws Exception;
//
//	Result countTbIndustrys(TbIndustrysModel tbIndustrysModel) throws Exception;
//
	 Boolean deleteTbIndustrys(String industryTypeCode) throws Exception;
}