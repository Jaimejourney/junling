package com.junling.mis.service.primary;

import com.junling.mis.model.primary.TbJob;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbJobService {

	Boolean addTbJob(TbJob tbJob) throws Exception;

	Boolean updateTbJob(TbJob tbJob) throws Exception;

	TbJob findDetailTbJob(String jobCode) throws Exception;
	
//	Result listTbJob(TbJobModel tbJobModel) throws Exception;
//
//    Result listTbJobPage(TbJobModel tbJobModel) throws Exception;
//
//	Result countTbJob(TbJobModel tbJobModel) throws Exception;
	
	Boolean deleteTbJob(String jobCode) throws Exception;
}