package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.pglProductDutyClaimRateEntity;
import com.junling.mis.model.pglProductDutyEntity;
import com.junling.mis.service.PglProductDutyClaimRateService;
import com.junling.mis.service.PglProductDutyService;
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
    public MakeResult addPglProductDuty(@RequestBody pglProductDutyEntity pglProductDutyEntity) throws Exception {
        if(service.addPglProductDuty(pglProductDutyEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePglProductDuty(@RequestBody pglProductDutyEntity pglProductDutyEntity) throws Exception {
        if(service.updatePglProductDuty(pglProductDutyEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{pglProductDutyId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<pglProductDutyEntity> searchPglProductDuty(@PathVariable("pglProductDutyId") String pglProductDutyId) throws Exception {
        pglProductDutyEntity pglProductDutyEntity = service.findDetailPglProductDuty(pglProductDutyId);
        MakeResult<pglProductDutyEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(pglProductDutyEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(pglProductDutyEntity);
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
