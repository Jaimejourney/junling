package com.junling.mis.service.primary;

import com.junling.mis.model.primary.tbJobEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface TbJobService {

	Boolean addTbJob(tbJobEntity tbJobEntity) throws Exception;

	Boolean updateTbJob(tbJobEntity tbJobEntity) throws Exception;

	tbJobEntity findDetailTbJob(String jobCode) throws Exception;
	
//	Result listTbJob(TbJobModel tbJobModel) throws Exception;
//
//    Result listTbJobPage(TbJobModel tbJobModel) throws Exception;
//
//	Result countTbJob(TbJobModel tbJobModel) throws Exception;
	
	Boolean deleteTbJob(String jobCode) throws Exception;
}