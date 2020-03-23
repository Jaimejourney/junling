package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.claimWorkFlowEntity;
import com.junling.mis.service.ClaimWorkFlowService;
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
    public MakeResult addClaimWorkFlow(@RequestBody claimWorkFlowEntity claimWorkFlowEntity) throws Exception {
        if(service.addClaimWorkFlow(claimWorkFlowEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateClaimWorkFlow(@RequestBody claimWorkFlowEntity claimWorkFlowEntity) throws Exception {
        if(service.updateClaimWorkFlow(claimWorkFlowEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{claimWorkFlowId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<claimWorkFlowEntity> searchClaimWorkFlow(@PathVariable("claimWorkFlowId") String claimWorkFlowId) throws Exception {
        claimWorkFlowEntity claimWorkFlowEntity = service.findDetailClaimWorkFlow(claimWorkFlowId);
        MakeResult<claimWorkFlowEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(claimWorkFlowEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(claimWorkFlowEntity);
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
