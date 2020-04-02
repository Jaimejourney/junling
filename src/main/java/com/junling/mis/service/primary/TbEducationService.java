package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbEducation;

;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbEducationService {

	Boolean addTbEducation(tbEducation tbEducation) throws Exception;

	Boolean updateTbEducation(tbEducation tbEducation) throws Exception;

	tbEducation findDetailTbEducation(String educationCode) throws Exception;
	
//	Result listTbEducation(TbEducationModel tbEducationModel) throws Exception;
//
//    Result listTbEducationPage(TbEducationModel tbEducationModel) throws Exception;
//
//	Result countTbEducation(TbEducationModel tbEducationModel) throws Exception;
	
	Boolean deleteTbEducation(String educationCode) throws Exception;
}