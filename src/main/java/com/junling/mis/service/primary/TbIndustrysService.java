package com.junling.mis.service.primary;

import com.junling.mis.model.primary.TbIndustrys;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbIndustrysService {

	Boolean addTbIndustrys(TbIndustrys tbIndustrys) throws Exception;

	Boolean updateTbIndustrys(TbIndustrys tbIndustrys) throws Exception;

	TbIndustrys findDetailTbIndustrys(String industryTypeCode) throws Exception;
	
//	Result listTbIndustrys(TbIndustrysModel tbIndustrysModel) throws Exception;
//
//    Result listTbIndustrysPage(TbIndustrysModel tbIndustrysModel) throws Exception;
//
//	Result countTbIndustrys(TbIndustrysModel tbIndustrysModel) throws Exception;
//
	 Boolean deleteTbIndustrys(String industryTypeCode) throws Exception;
}