package com.junling.mis.service.primary;

import com.junling.mis.model.primary.DutyInfo;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface DutyInfoService {

	Boolean addDutyInfo(DutyInfo dutyInfo) throws Exception;

	Boolean updateDutyInfo(DutyInfo dutyInfo) throws Exception;
//
	DutyInfo findDetailDutyInfo(String dutyId) throws Exception;
//
//	Result listDutyInfo(DutyInfoModel dutyInfoModel) throws Exception;
//
//    Result listDutyInfoPage(DutyInfoModel dutyInfoModel) throws Exception;
//
//	Result countDutyInfo(DutyInfoModel dutyInfoModel) throws Exception;
//
	Boolean deleteDutyInfo(String dutyId) throws Exception;
}