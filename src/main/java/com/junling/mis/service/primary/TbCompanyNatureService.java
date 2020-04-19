package com.junling.mis.service.primary;

import com.junling.mis.model.primary.TbCompanyNature;

;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbCompanyNatureService {

	Boolean addTbCompanyNature(TbCompanyNature tbCompanyNature) throws Exception;

	Boolean updateTbCompanyNature(TbCompanyNature tbCompanyNature) throws Exception;

	TbCompanyNature findDetailTbCompanyNature(String tbCompanyCode) throws Exception;
//
//	Result listTbCompanyNature(TbCompanyNatureModel tbCompanyNatureModel) throws Exception;
//
//    Result listTbCompanyNaturePage(TbCompanyNatureModel tbCompanyNatureModel) throws Exception;
//
//	Result countTbCompanyNature(TbCompanyNatureModel tbCompanyNatureModel) throws Exception;
//

	Boolean deleteTbCompanyNature(String tbCompanyCode) throws Exception;
}