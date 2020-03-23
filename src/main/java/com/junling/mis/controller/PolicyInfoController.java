package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.policyHealthNoteEntity;
import com.junling.mis.model.policyInfoEntity;
import com.junling.mis.service.PolicyHealthNoteService;
import com.junling.mis.service.PolicyInfoService;
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
    public MakeResult addPolicyInfo(@RequestBody policyInfoEntity policyInfoEntity) throws Exception {
        if(service.addPolicyInfo(policyInfoEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyInfo(@RequestBody policyInfoEntity policyInfoEntity) throws Exception {
        if(service.updatePolicyInfo(policyInfoEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{policyInfoId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<policyInfoEntity> searchPolicyInfo(@PathVariable("policyInfoId") String policyInfoId) throws Exception {
        policyInfoEntity policyInfoEntity = service.findDetailPolicyInfo(policyInfoId);
        MakeResult<policyInfoEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyInfoEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyInfoEntity);
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
