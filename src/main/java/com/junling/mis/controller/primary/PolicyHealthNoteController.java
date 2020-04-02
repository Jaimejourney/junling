package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.policyHealthNote;
import com.junling.mis.service.primary.PolicyHealthNoteService;
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
    public MakeResult addPolicyHealthNote(@RequestBody policyHealthNote policyHealthNote) throws Exception {
        if(service.addPolicyHealthNote(policyHealthNote)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updatePolicyHealthNote(@RequestBody policyHealthNote policyHealthNote) throws Exception {
        if(service.updatePolicyHealthNote(policyHealthNote)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{healthNoteId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<policyHealthNote> searchPolicyHealthNote(@PathVariable("healthNoteId") String healthNoteId) throws Exception {
        policyHealthNote policyHealthNote = service.findDetailPolicyHealthNote(healthNoteId);
        MakeResult<policyHealthNote> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(policyHealthNote == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(policyHealthNote);
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
