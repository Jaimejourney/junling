package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.dutySubInfoEntity;
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
    public MakeResult addDutySubInfo(@RequestBody dutySubInfoEntity dutySubInfoEntity) throws Exception {
        if(service.addDutySubInfo(dutySubInfoEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateDutySubInfo(@RequestBody dutySubInfoEntity dutySubInfoEntity) throws Exception {
        if(service.updateDutySubInfo(dutySubInfoEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{dutySubId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<dutySubInfoEntity> searchDutySubInfo(@PathVariable("dutySubId") String dutySubId) throws Exception {
        dutySubInfoEntity dutySubInfoEntity = service.findDetailDutySubInfo(dutySubId);
        MakeResult<dutySubInfoEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(dutySubInfoEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(dutySubInfoEntity);
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
