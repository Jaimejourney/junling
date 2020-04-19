package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.PglProductDuty;
import com.junling.mis.service.primary.PglProductDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/pglProductDuty")
public class PglProductDutyController {

    @Autowired
    private PglProductDutyService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addPglProductDuty(@RequestBody PglProductDuty pglProductDuty) throws Exception {
        if(service.addPglProductDuty(pglProductDuty)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePglProductDuty(@RequestBody PglProductDuty pglProductDuty) throws Exception {
        if(service.updatePglProductDuty(pglProductDuty)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{pglProductDutyId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<PglProductDuty> searchPglProductDuty(@PathVariable("pglProductDutyId") String pglProductDutyId) throws Exception {
        PglProductDuty pglProductDuty = service.findDetailPglProductDuty(pglProductDutyId);
        MakeResult<PglProductDuty> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(pglProductDuty == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(pglProductDuty);
    }

    @RequestMapping(value = "/delete/{pglProductDutyId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delPglProductDuty(@PathVariable("pglProductDutyId") String pglProductDutyId) throws Exception {
        if(service.deletePglProductDuty(pglProductDutyId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
