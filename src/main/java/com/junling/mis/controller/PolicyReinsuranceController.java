package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.policyPublicCoverageEntity;
import com.junling.mis.model.policyReinsuranceEntity;
import com.junling.mis.service.PolicyPublicCoverageService;
import com.junling.mis.service.PolicyReinsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/policyReinsurance")
public class PolicyReinsuranceController {

    @Autowired
    private PolicyReinsuranceService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addPolicyReinsurance(@RequestBody policyReinsuranceEntity policyReinsuranceEntity) throws Exception {
        if(service.addPolicyReinsurance(policyReinsuranceEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyReinsurance(@RequestBody policyReinsuranceEntity policyReinsuranceEntity) throws Exception {
        if(service.updatePolicyReinsurance(policyReinsuranceEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{policyReinsuranceId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<policyReinsuranceEntity> searchPolicyReinsurance(@PathVariable("policyReinsuranceId") String policyReinsuranceId) throws Exception {
        policyReinsuranceEntity policyReinsuranceEntity = service.findDetailPolicyReinsurance(policyReinsuranceId);
        MakeResult<policyReinsuranceEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyReinsuranceEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyReinsuranceEntity);
    }

    @RequestMapping(value = "/delete/{policyReinsuranceId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delPolicyReinsurance(@PathVariable("policyReinsuranceId") String policyReinsuranceId) throws Exception {
        if(service.deletePolicyReinsurance(policyReinsuranceId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
