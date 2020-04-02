package com.junling.mis.service.primary;

import com.junling.mis.model.primary.dutyInfo;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/16
 */
public interface DutyInfoService {

	Boolean addDutyInfo(dutyInfo dutyInfo) throws Exception;

	Boolean updateDutyInfo(dutyInfo dutyInfo) throws Exception;
//
	dutyInfo findDetailDutyInfo(String dutyId) throws Exception;
//
//	Result listDutyInfo(DutyInfoModel dutyInfoModel) throws Exception;
//
//    Result listDutyInfoPage(DutyInfoModel dutyInfoModel) throws Exception;
//
//	Result countDutyInfo(DutyInfoModel dutyInfoModel) throws Exception;
//
	Boolean deleteDutyInfo(String dutyId) throws Exception;
}