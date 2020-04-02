package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.claimAccountInfo;
import com.junling.mis.model.primary.claimAccountInfoKey;
import com.junling.mis.service.primary.ClaimAccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/claimAccount")
public class ClaimAccountInfoController {

    @Autowired
    private ClaimAccountInfoService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addClaimAccount(@RequestBody claimAccountInfo c) throws Exception {
        if(service.addClaimAccountInfo(c)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateClaimAccount(@RequestBody claimAccountInfo c) throws Exception {
        if(service.updateClaimAccountInfo(c)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult<claimAccountInfo> searchClaimAccount(@RequestBody claimAccountInfoKey key) throws Exception {
        claimAccountInfo claimAccountInfo = service.findDetailClaimAccountInfo(key);
        MakeResult<claimAccountInfo> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(claimAccountInfo == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(claimAccountInfo);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delClaimAccount(@RequestBody claimAccountInfoKey key) throws Exception {
       if(service.deleteClaimAccountInfo(key)){
           return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
           return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
       }
    }
}
