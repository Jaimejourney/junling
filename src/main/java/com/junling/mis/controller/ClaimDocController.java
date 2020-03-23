package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.claimDocEntity;
import com.junling.mis.service.ClaimDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/claimDoc")
public class ClaimDocController {

    @Autowired
    private ClaimDocService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addClaimDoc(@RequestBody claimDocEntity claimDocEntity) throws Exception {
        if(service.addClaimDoc(claimDocEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateClaimDoc(@RequestBody claimDocEntity claimDocEntity) throws Exception {
        if(service.updateClaimDoc(claimDocEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{docId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<claimDocEntity> searchClaimDoc(@PathVariable("docId") Integer docId) throws Exception {
        claimDocEntity claimDocEntity = service.findDetailClaimDoc(docId);
        MakeResult<claimDocEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(claimDocEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(claimDocEntity);
    }

    @RequestMapping(value = "/delete/{docId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delClaimDoc(@PathVariable("docId") Integer docId) throws Exception {
        if(service.deleteClaimDoc(docId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }


}
