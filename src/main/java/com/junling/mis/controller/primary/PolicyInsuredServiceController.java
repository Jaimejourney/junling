package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.PolicyInsuredService;
import com.junling.mis.service.primary.PolicyInsuredServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/policyInsuredService")
public class PolicyInsuredServiceController {

    @Autowired
    private PolicyInsuredServiceService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addPolicyInsuredService(@RequestBody PolicyInsuredService policyInsuredService) throws Exception {
        if(service.addPolicyInsuredService(policyInsuredService)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyInsuredService(@RequestBody PolicyInsuredService policyInsuredService) throws Exception {
        if(service.updatePolicyInsuredService(policyInsuredService)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{policyInsuredServiceId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<PolicyInsuredService> searchPolicyInsuredService(@PathVariable("policyInsuredServiceId") String policyInsuredServiceId) throws Exception {
        PolicyInsuredService policyInsuredService = service.findDetailPolicyInsuredService(policyInsuredServiceId);
        MakeResult<PolicyInsuredService> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyInsuredService == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyInsuredService);
    }

    @RequestMapping(value = "/delete/{policyInsuredServiceId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delPolicyInsuredService(@PathVariable("policyInsuredServiceId") String policyInsuredServiceId) throws Exception {
        if(service.deletePolicyInsuredService(policyInsuredServiceId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
