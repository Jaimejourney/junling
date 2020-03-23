package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.policyInsuredServiceEntity;
import com.junling.mis.model.policyPublicCoverageEntity;
import com.junling.mis.service.PolicyInsuredServiceService;
import com.junling.mis.service.PolicyPublicCoverageService;
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
    public MakeResult addPolicyPublicCoverage(@RequestBody policyPublicCoverageEntity policyPublicCoverageEntity) throws Exception {
        if(service.addPolicyPublicCoverage(policyPublicCoverageEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyPublicCoverage(@RequestBody policyPublicCoverageEntity policyPublicCoverageEntity) throws Exception {
        if(service.updatePolicyPublicCoverage(policyPublicCoverageEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{policyPublicCoverageId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<policyPublicCoverageEntity> searchPolicyPublicCoverage(@PathVariable("policyPublicCoverageId") String policyPublicCoverageId) throws Exception {
        policyPublicCoverageEntity policyPublicCoverageEntity = service.findDetailPolicyPublicCoverage(policyPublicCoverageId);
        MakeResult<policyPublicCoverageEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyPublicCoverageEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyPublicCoverageEntity);
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
