package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.*;
import com.junling.mis.service.PolicyReinsuranceService;
import com.junling.mis.service.PolicyShareCoverageService;
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
    public MakeResult addPolicyShareCoverage(@RequestBody policyShareCoverageEntity policyShareCoverageEntity) throws Exception {
        if(service.addPolicyShareCoverage(policyShareCoverageEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyShareCoverage(@RequestBody policyShareCoverageEntity policyShareCoverageEntity) throws Exception {
        if(service.updatePolicyShareCoverage(policyShareCoverageEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult<policyShareCoverageEntity> searchPolicyShareCoverage(@RequestBody policyShareCoverageEntityKey key) throws Exception {
        policyShareCoverageEntity policyShareCoverageEntity = service.findDetailPolicyShareCoverage(key);
        MakeResult<policyShareCoverageEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyShareCoverageEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyShareCoverageEntity);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult delPolicyShareCoverage(@RequestBody policyShareCoverageEntityKey key) throws Exception {
        if(service.deletePolicyShareCoverage(key)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
