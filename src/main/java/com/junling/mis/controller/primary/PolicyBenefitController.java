package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.policyBenefit;
import com.junling.mis.service.primary.PolicyBenefitService;
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
    public MakeResult addPolicyBenefit(@RequestBody policyBenefit policyBenefit) throws Exception {
        if(service.addPolicyBenefit(policyBenefit)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyBenefit(@RequestBody policyBenefit policyBenefit) throws Exception {
        if(service.updatePolicyBenefit(policyBenefit)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{policyBenefitId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<policyBenefit> searchPolicyBenefit(@PathVariable("policyBenefitId") String policyBenefitId) throws Exception {
        policyBenefit policyBenefit = service.findDetailPolicyBenefit(policyBenefitId);
        MakeResult<policyBenefit> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyBenefit == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyBenefit);
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
