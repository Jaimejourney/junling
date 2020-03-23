package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.pglProductSubDutyEntity;
import com.junling.mis.model.policyBenefitEntity;
import com.junling.mis.service.PglProductSubDutyService;
import com.junling.mis.service.PolicyBenefitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/policyBenefit")
public class PolicyBenefitController {

    @Autowired
    private PolicyBenefitService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addPolicyBenefit(@RequestBody policyBenefitEntity policyBenefitEntity) throws Exception {
        if(service.addPolicyBenefit(policyBenefitEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyBenefit(@RequestBody policyBenefitEntity policyBenefitEntity) throws Exception {
        if(service.updatePolicyBenefit(policyBenefitEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{policyBenefitId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<policyBenefitEntity> searchPolicyBenefit(@PathVariable("policyBenefitId") String policyBenefitId) throws Exception {
        policyBenefitEntity policyBenefitEntity = service.findDetailPolicyBenefit(policyBenefitId);
        MakeResult<policyBenefitEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyBenefitEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyBenefitEntity);
    }

    @RequestMapping(value = "/delete/{policyBenefitId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delPolicyBenefit(@PathVariable("policyBenefitId") String policyBenefitId) throws Exception {
        if(service.deletePolicyBenefit(policyBenefitId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
