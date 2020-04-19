package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.PolicyGradeLevelPro;
import com.junling.mis.service.primary.PolicyGradeLevelProductService;
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
    public MakeResult addPolicyGradeLevelProduct(@RequestBody PolicyGradeLevelPro policyGradeLevelPro) throws Exception {
        if(service.addPolicyGradeLevelProduct(policyGradeLevelPro)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyGradeLevelProduct(@RequestBody PolicyGradeLevelPro policyGradeLevelPro) throws Exception {
        if(service.updatePolicyGradeLevelProduct(policyGradeLevelPro)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{pglProductId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<PolicyGradeLevelPro> searchPolicyGradeLevelProduct(@PathVariable("pglProductId") String pglProductId) throws Exception {
        PolicyGradeLevelPro policyGradeLevelPro = service.findDetailPolicyGradeLevelProduct(pglProductId);
        MakeResult<PolicyGradeLevelPro> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyGradeLevelPro == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyGradeLevelPro);
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
