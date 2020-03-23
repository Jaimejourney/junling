package com.junling.mis.service;

import com.junling.mis.model.tbEducationEntity;

;


/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbEducationService {

	Boolean addTbEducation(tbEducationEntity tbEducationEntity) throws Exception;

	Boolean updateTbEducation(tbEducationEntity tbEducationEntity) throws Exception;

	tbEducationEntity findDetailTbEducation(String educationCode) throws Exception;
	
//	Result listTbEducation(TbEducationModel tbEducationModel) throws Exception;
//
//    Result listTbEducationPage(TbEducationModel tbEducationModel) throws Exception;
//
//	Result countTbEducation(TbEducationModel tbEducationModel) throws Exception;
	
	Boolean deleteTbEducation(String educationCode) throws Exception;
}