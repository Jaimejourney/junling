package com.junling.mis.service;

import com.junling.mis.model.tbCompanyNatureEntity;

;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbCompanyNatureService {

	Boolean addTbCompanyNature(tbCompanyNatureEntity tbCompanyNatureEntity) throws Exception;

	Boolean updateTbCompanyNature(tbCompanyNatureEntity tbCompanyNatureEntity) throws Exception;

	tbCompanyNatureEntity findDetailTbCompanyNature(String tbCompanyCode) throws Exception;
//
//	Result listTbCompanyNature(TbCompanyNatureModel tbCompanyNatureModel) throws Exception;
//
//    Result listTbCompanyNaturePage(TbCompanyNatureModel tbCompanyNatureModel) throws Exception;
//
//	Result countTbCompanyNature(TbCompanyNatureModel tbCompanyNatureModel) throws Exception;
//

	Boolean deleteTbCompanyNature(String tbCompanyCode) throws Exception;
}