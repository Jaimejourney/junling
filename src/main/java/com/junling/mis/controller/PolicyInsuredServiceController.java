package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.policyInsuredEntity;
import com.junling.mis.model.policyInsuredServiceEntity;
import com.junling.mis.service.PolicyInsuredService;
import com.junling.mis.service.PolicyInsuredServiceService;
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
    public MakeResult addPolicyInsuredService(@RequestBody policyInsuredServiceEntity policyInsuredServiceEntity) throws Exception {
        if(service.addPolicyInsuredService(policyInsuredServiceEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyInsuredService(@RequestBody policyInsuredServiceEntity policyInsuredServiceEntity) throws Exception {
        if(service.updatePolicyInsuredService(policyInsuredServiceEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{policyInsuredServiceId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<policyInsuredServiceEntity> searchPolicyInsuredService(@PathVariable("policyInsuredServiceId") String policyInsuredServiceId) throws Exception {
        policyInsuredServiceEntity policyInsuredServiceEntity = service.findDetailPolicyInsuredService(policyInsuredServiceId);
        MakeResult<policyInsuredServiceEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyInsuredServiceEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyInsuredServiceEntity);
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
