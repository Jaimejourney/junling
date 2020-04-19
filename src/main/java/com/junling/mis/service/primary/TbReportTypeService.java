package com.junling.mis.service.primary;

import com.junling.mis.model.primary.TbReportType;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbReportTypeService {

	Boolean addTbReportType(TbReportType tbReportType) throws Exception;

	Boolean updateTbReportType(TbReportType tbReportType) throws Exception;

	TbReportType findDetailTbReportType(String reportTypeCode) throws Exception;
	
//	Result listTbReportType(TbReportTypeModel tbReportTypeModel) throws Exception;
//
//    Result listTbReportTypePage(TbReportTypeModel tbReportTypeModel) throws Exception;
//
//	Result countTbReportType(TbReportTypeModel tbReportTypeModel) throws Exception;
	
	Boolean deleteTbReportType(String reportTypeCode) throws Exception;
}