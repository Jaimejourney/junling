package com.junling.mis.service.impl;

import com.junling.mis.mapper.syncLogEntityMapper;
import com.junling.mis.model.syncLogEntity;
import com.junling.mis.service.SyncLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/** 
 * <br/>
 * Created by yikaiZhu on 2020/03/17
 */
@Service("syncLogService")
public class SyncLogServiceImpl implements SyncLogService {

	private final static Logger LOG = LoggerFactory.getLogger(SyncLogServiceImpl.class);

	@Resource
	private com.junling.mis.mapper.syncLogEntityMapper syncLogEntityMapper;

	@Override
	public Boolean addSyncLog(syncLogEntity syncLogEntity) throws Exception {
		return syncLogEntityMapper.insert(syncLogEntity)>0;
	}

	@Override
	public Boolean updateSyncLog(syncLogEntity syncLogEntity) throws Exception {
		return syncLogEntityMapper.updateByPrimaryKey(syncLogEntity)>0;
	}

	@Override
	public syncLogEntity findDetailSyncLog(String tableName) throws Exception {
		return syncLogEntityMapper.selectByPrimaryKey(tableName);
	}

	@Override
	public Boolean deleteSyncLog(String tableName) throws Exception {
		return syncLogEntityMapper.deleteByPrimaryKey(tableName)>0;
	}

//	@Override
//	public Result addSyncLog(SyncLogModel syncLogModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result updateSyncLog(SyncLogModel syncLogModel) throws Exception {
//		return null;
//	}
//
//	@Override
//	public Result findDetailSyncLog(SyncLogModel syncLogModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listSyncLog(SyncLogModel syncLogModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result listSyncLogPage(SyncLogModel syncLogModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result countSyncLog(SyncLogModel syncLogModel) throws Exception{
//		return null;
//	}
//
//	@Override
//	public Result deleteSyncLog(SyncLogModel syncLogModel) throws Exception{
//		return null;
//	}

}