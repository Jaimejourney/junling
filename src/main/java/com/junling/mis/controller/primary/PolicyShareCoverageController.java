package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.policyShareCoverage;
import com.junling.mis.model.primary.policyShareCoverageKey;
import com.junling.mis.service.primary.PolicyShareCoverageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/policyShareCoverage")
public class PolicyShareCoverageController {

    @Autowired
    private PolicyShareCoverageService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addPolicyShareCoverage(@RequestBody policyShareCoverage policyShareCoverage) throws Exception {
        if(service.addPolicyShareCoverage(policyShareCoverage)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyShareCoverage(@RequestBody policyShareCoverage policyShareCoverage) throws Exception {
        if(service.updatePolicyShareCoverage(policyShareCoverage)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult<policyShareCoverage> searchPolicyShareCoverage(@RequestBody policyShareCoverageKey key) throws Exception {
        policyShareCoverage policyShareCoverage = service.findDetailPolicyShareCoverage(key);
        MakeResult<policyShareCoverage> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyShareCoverage == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyShareCoverage);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult delPolicyShareCoverage(@RequestBody policyShareCoverageKey key) throws Exception {
        if(service.deletePolicyShareCoverage(key)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
