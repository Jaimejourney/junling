package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.policyInsured;
import com.junling.mis.service.primary.PolicyInsuredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/policyInsured")
public class PolicyInsuredController {

    @Autowired
    private PolicyInsuredService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addPolicyInsured(@RequestBody policyInsured policyInsured) throws Exception {
        if(service.addPolicyInsured(policyInsured)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyInsured(@RequestBody policyInsured policyInsured) throws Exception {
        if(service.updatePolicyInsured(policyInsured)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{policyInsuredId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<policyInsured> searchPolicyInsured(@PathVariable("policyInsuredId") String policyInsuredId) throws Exception {
        policyInsured policyInsured = service.findDetailPolicyInsured(policyInsuredId);
        MakeResult<policyInsured> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyInsured == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyInsured);
    }

    @RequestMapping(value = "/delete/{policyInsuredId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delPolicyInsured(@PathVariable("policyInsuredId") String policyInsuredId) throws Exception {
        if(service.deletePolicyInsured(policyInsuredId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
