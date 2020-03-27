package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.pglProductSubDutyEntity;
import com.junling.mis.service.primary.PglProductSubDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/pglProductSubDuty")
public class PglProductSubDutyController {

    @Autowired
    private PglProductSubDutyService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addPglProductSubDuty(@RequestBody pglProductSubDutyEntity pglProductSubDutyEntity) throws Exception {
        if(service.addPglProductSubDuty(pglProductSubDutyEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePglProductSubDuty(@RequestBody pglProductSubDutyEntity pglProductSubDutyEntity) throws Exception {
        if(service.updatePglProductSubDuty(pglProductSubDutyEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{pglProductSubDutyId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<pglProductSubDutyEntity> searchPglProductSubDuty(@PathVariable("pglProductSubDutyId") String pglProductSubDutyId) throws Exception {
        pglProductSubDutyEntity pglProductSubDutyEntity = service.findDetailPglProductSubDuty(pglProductSubDutyId);
        MakeResult<pglProductSubDutyEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(pglProductSubDutyEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(pglProductSubDutyEntity);
    }

    @RequestMapping(value = "/delete/{pglProductSubDutyId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delPglProductSubDuty(@PathVariable("pglProductSubDutyId") String pglProductSubDutyId) throws Exception {
        if(service.deletePglProductSubDuty(pglProductSubDutyId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
