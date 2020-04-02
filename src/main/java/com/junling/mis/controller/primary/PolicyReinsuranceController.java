package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.policyReinsurance;
import com.junling.mis.service.primary.PolicyReinsuranceService;
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
    public MakeResult addPolicyReinsurance(@RequestBody policyReinsurance policyReinsurance) throws Exception {
        if(service.addPolicyReinsurance(policyReinsurance)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyReinsurance(@RequestBody policyReinsurance policyReinsurance) throws Exception {
        if(service.updatePolicyReinsurance(policyReinsurance)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{policyReinsuranceId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<policyReinsurance> searchPolicyReinsurance(@PathVariable("policyReinsuranceId") String policyReinsuranceId) throws Exception {
        policyReinsurance policyReinsurance = service.findDetailPolicyReinsurance(policyReinsuranceId);
        MakeResult<policyReinsurance> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyReinsurance == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyReinsurance);
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
