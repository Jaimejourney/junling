package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.PolicyInfo;
import com.junling.mis.service.primary.PolicyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/policyInfo")
public class PolicyInfoController {

    @Autowired
    private PolicyInfoService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addPolicyInfo(@RequestBody PolicyInfo policyInfo) throws Exception {
        if(service.addPolicyInfo(policyInfo)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyInfo(@RequestBody PolicyInfo policyInfo) throws Exception {
        if(service.updatePolicyInfo(policyInfo)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{policyInfoId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<PolicyInfo> searchPolicyInfo(@PathVariable("policyInfoId") String policyInfoId) throws Exception {
        PolicyInfo policyInfo = service.findDetailPolicyInfo(policyInfoId);
        MakeResult<PolicyInfo> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyInfo == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyInfo);
    }

    @RequestMapping(value = "/delete/{policyInfoId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delPolicyInfo(@PathVariable("policyInfoId") String policyInfoId) throws Exception {
        if(service.deletePolicyInfo(policyInfoId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
