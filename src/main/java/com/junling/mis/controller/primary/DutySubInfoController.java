package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.DutySubInfo;
import com.junling.mis.service.primary.DutySubInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/dutySubInfo")
public class DutySubInfoController {

    @Autowired
    private DutySubInfoService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDutySubInfo(@RequestBody DutySubInfo dutySubInfo) throws Exception {
        if(service.addDutySubInfo(dutySubInfo)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateDutySubInfo(@RequestBody DutySubInfo dutySubInfo) throws Exception {
        if(service.updateDutySubInfo(dutySubInfo)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{dutySubId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<DutySubInfo> searchDutySubInfo(@PathVariable("dutySubId") String dutySubId) throws Exception {
        DutySubInfo dutySubInfo = service.findDetailDutySubInfo(dutySubId);
        MakeResult<DutySubInfo> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(dutySubInfo == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(dutySubInfo);
    }

    @RequestMapping(value = "/delete/{dutySubId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delDutySubInfo(@PathVariable("dutySubId") String dutySubId) throws Exception {
        if(service.deleteDutySubInfo(dutySubId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
