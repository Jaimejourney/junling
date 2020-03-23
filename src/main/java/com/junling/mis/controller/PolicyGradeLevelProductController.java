package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.policyBenefitEntity;
import com.junling.mis.model.policyGradeLevelProductEntity;
import com.junling.mis.service.PolicyBenefitService;
import com.junling.mis.service.PolicyGradeLevelProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/policyGradeLevelProduct")
public class PolicyGradeLevelProductController {

    @Autowired
    private PolicyGradeLevelProductService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addPolicyGradeLevelProduct(@RequestBody policyGradeLevelProductEntity policyGradeLevelProductEntity) throws Exception {
        if(service.addPolicyGradeLevelProduct(policyGradeLevelProductEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyGradeLevelProduct(@RequestBody policyGradeLevelProductEntity policyGradeLevelProductEntity) throws Exception {
        if(service.updatePolicyGradeLevelProduct(policyGradeLevelProductEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{pglProductId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<policyGradeLevelProductEntity> searchPolicyGradeLevelProduct(@PathVariable("pglProductId") String pglProductId) throws Exception {
        policyGradeLevelProductEntity policyGradeLevelProductEntity = service.findDetailPolicyGradeLevelProduct(pglProductId);
        MakeResult<policyGradeLevelProductEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyGradeLevelProductEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyGradeLevelProductEntity);
    }

    @RequestMapping(value = "/delete/{pglProductId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delPolicyGradeLevelProduct(@PathVariable("pglProductId") String pglProductId) throws Exception {
        if(service.deletePolicyGradeLevelProduct(pglProductId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
