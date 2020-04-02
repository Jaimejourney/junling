package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.claimDoc;
import com.junling.mis.model.primary.claimDocKey;
import com.junling.mis.service.primary.ClaimDocService;
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
    public MakeResult addClaimDoc(@RequestBody claimDoc claimDoc) throws Exception {
        if(service.addClaimDoc(claimDoc)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateClaimDoc(@RequestBody claimDoc claimDoc) throws Exception {
        if(service.updateClaimDoc(claimDoc)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult<claimDoc> searchClaimDoc(@RequestBody claimDocKey key) throws Exception {
        claimDoc claimDoc = service.findDetailClaimDoc(key);
        MakeResult<claimDoc> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(claimDoc == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(claimDoc);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult delClaimDoc(@RequestBody claimDocKey key) throws Exception {
        if(service.deleteClaimDoc(key)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }


}
