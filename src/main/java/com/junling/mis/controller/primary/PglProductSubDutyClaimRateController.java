package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.pglpsdClaimRate;
import com.junling.mis.service.primary.PglProductSubDutyClaimRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/pglProductSubDutyClaimRate")
public class PglProductSubDutyClaimRateController {

    @Autowired
    private PglProductSubDutyClaimRateService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addPglProductSubDutyClaimRate(@RequestBody pglpsdClaimRate pglpsdClaimRate) throws Exception {
        if(service.addPglProductSubDutyClaimRate(pglpsdClaimRate)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePglProductSubDutyClaimRate(@RequestBody pglpsdClaimRate pglpsdClaimRate) throws Exception {
        if(service.updatePglProductSubDutyClaimRate(pglpsdClaimRate)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{pglpsdClaimRateId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<pglpsdClaimRate> searchPglProductSubDutyClaimRate(@PathVariable("pglpsdClaimRateId") String pglpsdClaimRateId) throws Exception {
        pglpsdClaimRate pglpsdClaimRate = service.findDetailPglProductSubDutyClaimRate(pglpsdClaimRateId);
        MakeResult<pglpsdClaimRate> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(pglpsdClaimRate == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(pglpsdClaimRate);
    }

    @RequestMapping(value = "/delete/{pglpsdClaimRateId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delPglProductSubDutyClaimRate(@PathVariable("pglpsdClaimRateId") String pglpsdClaimRateId) throws Exception {
        if(service.deletePglProductSubDutyClaimRate(pglpsdClaimRateId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
