package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.DutyInfo;
import com.junling.mis.service.primary.DutyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/dutyInfo")
public class DutyInfoController {

    @Autowired
    private DutyInfoService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDutyInfo(@RequestBody DutyInfo dutyInfo) throws Exception {
        if(service.addDutyInfo(dutyInfo)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateDutyInfo(@RequestBody DutyInfo dutyInfo) throws Exception {
        if(service.updateDutyInfo(dutyInfo)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{dutyId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<DutyInfo> searchDutyInfo(@PathVariable("dutyId") String dutyId) throws Exception {
        DutyInfo dutyInfo = service.findDetailDutyInfo(dutyId);
        MakeResult<DutyInfo> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(dutyInfo == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(dutyInfo);
    }

    @RequestMapping(value = "/delete/{dutyId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delDutyInfo(@PathVariable("dutyId") String dutyId) throws Exception {
        if(service.deleteDutyInfo(dutyId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
