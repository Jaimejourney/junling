package com.junling.mis.service.primary;

import com.junling.mis.model.primary.syncLogEntity;

;



/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
public interface SyncLogService {

	Boolean addSyncLog(syncLogEntity syncLogEntity) throws Exception;

	Boolean updateSyncLog(syncLogEntity syncLogEntity) throws Exception;

	syncLogEntity findDetailSyncLog(String tableName) throws Exception;

//	Result listSyncLog(SyncLogModel syncLogModel) throws Exception;
//
//    Result listSyncLogPage(SyncLogModel syncLogModel) throws Exception;
//
//	Result countSyncLog(SyncLogModel syncLogModel) throws Exception;
	
	Boolean deleteSyncLog(String tableName) throws Exception;
}