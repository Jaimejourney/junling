package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.pglProductDutyClaimRateEntity;
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
    public MakeResult addPglProductDutyClaimRate(@RequestBody pglProductDutyClaimRateEntity pglProductDutyClaimRateEntity) throws Exception {
        if(service.addPglProductDutyClaimRate(pglProductDutyClaimRateEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePglProductDutyClaimRate(@RequestBody pglProductDutyClaimRateEntity pglProductDutyClaimRateEntity) throws Exception {
        if(service.updatePglProductDutyClaimRate(pglProductDutyClaimRateEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{pglpdClaimRateId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<pglProductDutyClaimRateEntity> searchPglProductDutyClaimRate(@PathVariable("pglpdClaimRateId") String pglpdClaimRateId) throws Exception {
        pglProductDutyClaimRateEntity pglProductDutyClaimRateEntity = service.findDetailPglProductDutyClaimRate(pglpdClaimRateId);
        MakeResult<pglProductDutyClaimRateEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(pglProductDutyClaimRateEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(pglProductDutyClaimRateEntity);
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
