package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.syncLogEntity;
import com.junling.mis.service.primary.SyncLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/syncLog")
public class SyncLogController {

    @Autowired
    private SyncLogService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addSyncLog(@RequestBody syncLogEntity syncLogEntity) throws Exception {
        if(service.addSyncLog(syncLogEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateSyncLog(@RequestBody syncLogEntity syncLogEntity) throws Exception {
        if(service.updateSyncLog(syncLogEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{tableName}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<syncLogEntity> searchSyncLog(@PathVariable("tableName") String tableName) throws Exception {
        syncLogEntity syncLogEntity = service.findDetailSyncLog(tableName);
        MakeResult<syncLogEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(syncLogEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(syncLogEntity);
    }

    @RequestMapping(value = "/delete/{tableName}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delSyncLog(@PathVariable("tableName") String tableName) throws Exception {
        if(service.deleteSyncLog(tableName)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
