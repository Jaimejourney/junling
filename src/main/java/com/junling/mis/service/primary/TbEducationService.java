package com.junling.mis.service.primary;

import com.junling.mis.model.primary.TbEducation;

;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbEducationService {

	Boolean addTbEducation(TbEducation tbEducation) throws Exception;

	Boolean updateTbEducation(TbEducation tbEducation) throws Exception;

	TbEducation findDetailTbEducation(String educationCode) throws Exception;
	
//	Result listTbEducation(TbEducationModel tbEducationModel) throws Exception;
//
//    Result listTbEducationPage(TbEducationModel tbEducationModel) throws Exception;
//
//	Result countTbEducation(TbEducationModel tbEducationModel) throws Exception;
	
	Boolean deleteTbEducation(String educationCode) throws Exception;
}