package com.junling.mis.service;

import com.junling.mis.model.tbGenderEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbGenderService {

	Boolean addTbGender(tbGenderEntity tbGenderEntity) throws Exception;

	Boolean updateTbGender(tbGenderEntity tbGenderEntity) throws Exception;

	tbGenderEntity findDetailTbGender(String genderCode) throws Exception;

//	Result listTbGender(TbGenderModel tbGenderModel) throws Exception;
//
//    Result listTbGenderPage(TbGenderModel tbGenderModel) throws Exception;
//
//	Result countTbGender(TbGenderModel tbGenderModel) throws Exception;
//
	Boolean deleteTbGender(String genderCode) throws Exception;
}