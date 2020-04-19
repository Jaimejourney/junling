package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.ClaimWorkFlow;
import com.junling.mis.service.primary.ClaimWorkFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/claimWorkFlow")
public class ClaimWorkFlowController {

    @Autowired
    private ClaimWorkFlowService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addClaimWorkFlow(@RequestBody ClaimWorkFlow claimWorkFlow) throws Exception {
        if(service.addClaimWorkFlow(claimWorkFlow)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateClaimWorkFlow(@RequestBody ClaimWorkFlow claimWorkFlow) throws Exception {
        if(service.updateClaimWorkFlow(claimWorkFlow)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{claimWorkFlowId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<ClaimWorkFlow> searchClaimWorkFlow(@PathVariable("claimWorkFlowId") String claimWorkFlowId) throws Exception {
        ClaimWorkFlow claimWorkFlow = service.findDetailClaimWorkFlow(claimWorkFlowId);
        MakeResult<ClaimWorkFlow> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(claimWorkFlow == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(claimWorkFlow);
    }

    @RequestMapping(value = "/delete/{claimWorkFlowId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delClaimWorkFlow(@PathVariable("claimWorkFlowId") String claimWorkFlowId) throws Exception {
        if(service.deleteClaimWorkFlow(claimWorkFlowId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
