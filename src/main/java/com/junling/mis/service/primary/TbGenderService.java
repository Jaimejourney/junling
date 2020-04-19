package com.junling.mis.service.primary;

import com.junling.mis.model.primary.TbGender;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbGenderService {

	Boolean addTbGender(TbGender tbGender) throws Exception;

	Boolean updateTbGender(TbGender tbGender) throws Exception;

	TbGender findDetailTbGender(String genderCode) throws Exception;

//	Result listTbGender(TbGenderModel tbGenderModel) throws Exception;
//
//    Result listTbGenderPage(TbGenderModel tbGenderModel) throws Exception;
//
//	Result countTbGender(TbGenderModel tbGenderModel) throws Exception;
//
	Boolean deleteTbGender(String genderCode) throws Exception;
}