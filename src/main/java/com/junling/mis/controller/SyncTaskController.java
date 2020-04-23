package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.service.SyncTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/syncTask")
public class SyncTaskController {

    @Autowired
    private SyncTaskService syncTaskService;

    @RequestMapping(value = "/run", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult runSyncTask() throws Exception {
        String time = syncTaskService.myTask();
        MakeResult<String> result = MakeResult.createResult(ResultStatus.OK_CODE);
        return result.addResults(time);
    }
}
