package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.policyPublicCoverage;
import com.junling.mis.service.primary.PolicyPublicCoverageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/policyPublicCoverage")
public class PolicyPublicCoverageController {

    @Autowired
    private PolicyPublicCoverageService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addPolicyPublicCoverage(@RequestBody policyPublicCoverage policyPublicCoverage) throws Exception {
        if(service.addPolicyPublicCoverage(policyPublicCoverage)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyPublicCoverage(@RequestBody policyPublicCoverage policyPublicCoverage) throws Exception {
        if(service.updatePolicyPublicCoverage(policyPublicCoverage)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{policyPublicCoverageId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<policyPublicCoverage> searchPolicyPublicCoverage(@PathVariable("policyPublicCoverageId") String policyPublicCoverageId) throws Exception {
        policyPublicCoverage policyPublicCoverage = service.findDetailPolicyPublicCoverage(policyPublicCoverageId);
        MakeResult<policyPublicCoverage> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyPublicCoverage == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyPublicCoverage);
    }

    @RequestMapping(value = "/delete/{policyPublicCoverageId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delPolicyPublicCoverage(@PathVariable("policyPublicCoverageId") String policyPublicCoverageId) throws Exception {
        if(service.deletePolicyPublicCoverage(policyPublicCoverageId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
