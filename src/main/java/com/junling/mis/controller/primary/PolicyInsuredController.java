package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.policyInsuredEntity;
import com.junling.mis.service.primary.PolicyInsuredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/policyInsured")
public class PolicyInsuredController {

    @Autowired
    private PolicyInsuredService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addPolicyInsured(@RequestBody policyInsuredEntity policyInsuredEntity) throws Exception {
        if(service.addPolicyInsured(policyInsuredEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyInsured(@RequestBody policyInsuredEntity policyInsuredEntity) throws Exception {
        if(service.updatePolicyInsured(policyInsuredEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{policyInsuredId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<policyInsuredEntity> searchPolicyInsured(@PathVariable("policyInsuredId") String policyInsuredId) throws Exception {
        policyInsuredEntity policyInsuredEntity = service.findDetailPolicyInsured(policyInsuredId);
        MakeResult<policyInsuredEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyInsuredEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyInsuredEntity);
    }

    @RequestMapping(value = "/delete/{policyInsuredId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delPolicyInsured(@PathVariable("policyInsuredId") String policyInsuredId) throws Exception {
        if(service.deletePolicyInsured(policyInsuredId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
