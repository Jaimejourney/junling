package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.policyGradeLevelProductEntity;
import com.junling.mis.model.policyHealthNoteEntity;
import com.junling.mis.service.PolicyGradeLevelProductService;
import com.junling.mis.service.PolicyHealthNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/policyHealthNote")
public class PolicyHealthNoteController {

    @Autowired
    private PolicyHealthNoteService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addPolicyHealthNote(@RequestBody policyHealthNoteEntity policyHealthNoteEntity) throws Exception {
        if(service.addPolicyHealthNote(policyHealthNoteEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyHealthNote(@RequestBody policyHealthNoteEntity policyHealthNoteEntity) throws Exception {
        if(service.updatePolicyHealthNote(policyHealthNoteEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{healthNoteId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<policyHealthNoteEntity> searchPolicyHealthNote(@PathVariable("healthNoteId") String healthNoteId) throws Exception {
        policyHealthNoteEntity policyHealthNoteEntity = service.findDetailPolicyHealthNote(healthNoteId);
        MakeResult<policyHealthNoteEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyHealthNoteEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyHealthNoteEntity);
    }

    @RequestMapping(value = "/delete/{healthNoteId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delPolicyHealthNote(@PathVariable("healthNoteId") String healthNoteId) throws Exception {
        if(service.deletePolicyHealthNote(healthNoteId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
