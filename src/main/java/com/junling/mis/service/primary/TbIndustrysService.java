package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbIndustrys;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbIndustrysService {

	Boolean addTbIndustrys(tbIndustrys tbIndustrys) throws Exception;

	Boolean updateTbIndustrys(tbIndustrys tbIndustrys) throws Exception;

	tbIndustrys findDetailTbIndustrys(String industryTypeCode) throws Exception;
	
//	Result listTbIndustrys(TbIndustrysModel tbIndustrysModel) throws Exception;
//
//    Result listTbIndustrysPage(TbIndustrysModel tbIndustrysModel) throws Exception;
//
//	Result countTbIndustrys(TbIndustrysModel tbIndustrysModel) throws Exception;
//
	 Boolean deleteTbIndustrys(String industryTypeCode) throws Exception;
}