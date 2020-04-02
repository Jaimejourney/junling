package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbCompanyNature;

;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbCompanyNatureService {

	Boolean addTbCompanyNature(tbCompanyNature tbCompanyNature) throws Exception;

	Boolean updateTbCompanyNature(tbCompanyNature tbCompanyNature) throws Exception;

	tbCompanyNature findDetailTbCompanyNature(String tbCompanyCode) throws Exception;
//
//	Result listTbCompanyNature(TbCompanyNatureModel tbCompanyNatureModel) throws Exception;
//
//    Result listTbCompanyNaturePage(TbCompanyNatureModel tbCompanyNatureModel) throws Exception;
//
//	Result countTbCompanyNature(TbCompanyNatureModel tbCompanyNatureModel) throws Exception;
//

	Boolean deleteTbCompanyNature(String tbCompanyCode) throws Exception;
}