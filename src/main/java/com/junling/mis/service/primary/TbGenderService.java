package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbGender;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbGenderService {

	Boolean addTbGender(tbGender tbGender) throws Exception;

	Boolean updateTbGender(tbGender tbGender) throws Exception;

	tbGender findDetailTbGender(String genderCode) throws Exception;

//	Result listTbGender(TbGenderModel tbGenderModel) throws Exception;
//
//    Result listTbGenderPage(TbGenderModel tbGenderModel) throws Exception;
//
//	Result countTbGender(TbGenderModel tbGenderModel) throws Exception;
//
	Boolean deleteTbGender(String genderCode) throws Exception;
}