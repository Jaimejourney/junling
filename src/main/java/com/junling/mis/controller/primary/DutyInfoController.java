package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.dutyInfoEntity;
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
    public MakeResult addDutyInfo(@RequestBody dutyInfoEntity dutyInfoEntity) throws Exception {
        if(service.addDutyInfo(dutyInfoEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateDutyInfo(@RequestBody dutyInfoEntity dutyInfoEntity) throws Exception {
        if(service.updateDutyInfo(dutyInfoEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{dutyId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<dutyInfoEntity> searchDutyInfo(@PathVariable("dutyId") String dutyId) throws Exception {
        dutyInfoEntity dutyInfoEntity = service.findDetailDutyInfo(dutyId);
        MakeResult<dutyInfoEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(dutyInfoEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(dutyInfoEntity);
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
