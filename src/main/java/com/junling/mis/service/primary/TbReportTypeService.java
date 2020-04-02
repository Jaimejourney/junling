package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbReportType;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbReportTypeService {

	Boolean addTbReportType(tbReportType tbReportType) throws Exception;

	Boolean updateTbReportType(tbReportType tbReportType) throws Exception;

	tbReportType findDetailTbReportType(String reportTypeCode) throws Exception;
	
//	Result listTbReportType(TbReportTypeModel tbReportTypeModel) throws Exception;
//
//    Result listTbReportTypePage(TbReportTypeModel tbReportTypeModel) throws Exception;
//
//	Result countTbReportType(TbReportTypeModel tbReportTypeModel) throws Exception;
	
	Boolean deleteTbReportType(String reportTypeCode) throws Exception;
}