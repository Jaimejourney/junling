package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.pglpdClaimRate;
import com.junling.mis.service.primary.PglProductDutyClaimRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/pglProductDutyClaimRate")
public class PglProductDutyClaimRateController {

    @Autowired
    private PglProductDutyClaimRateService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addPglProductDutyClaimRate(@RequestBody pglpdClaimRate pglpdClaimRate) throws Exception {
        if(service.addPglProductDutyClaimRate(pglpdClaimRate)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePglProductDutyClaimRate(@RequestBody pglpdClaimRate pglpdClaimRate) throws Exception {
        if(service.updatePglProductDutyClaimRate(pglpdClaimRate)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{pglpdClaimRateId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<pglpdClaimRate> searchPglProductDutyClaimRate(@PathVariable("pglpdClaimRateId") String pglpdClaimRateId) throws Exception {
        pglpdClaimRate pglProductDutyClaimRate = service.findDetailPglProductDutyClaimRate(pglpdClaimRateId);
        MakeResult<pglpdClaimRate> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(pglProductDutyClaimRate == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(pglProductDutyClaimRate);
    }

    @RequestMapping(value = "/delete/{pglpdClaimRateId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delPglProductDutyClaimRate(@PathVariable("pglpdClaimRateId") String pglpdClaimRateId) throws Exception {
        if(service.deletePglProductDutyClaimRate(pglpdClaimRateId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
