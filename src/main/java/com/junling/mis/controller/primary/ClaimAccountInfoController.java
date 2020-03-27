package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.claimAccountInfoEntity;
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
    public MakeResult addClaimAccount(@RequestBody claimAccountInfoEntity c) throws Exception {
        if(service.addClaimAccountInfo(c)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateClaimAccount(@RequestBody claimAccountInfoEntity c) throws Exception {
        if(service.updateClaimAccountInfo(c)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{accountId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<claimAccountInfoEntity> searchClaimAccount(@PathVariable("accountId") String accountId) throws Exception {
        claimAccountInfoEntity claimAccountInfoEntity = service.findDetailClaimAccountInfo(accountId);
        MakeResult<claimAccountInfoEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(claimAccountInfoEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(claimAccountInfoEntity);
    }

    @RequestMapping(value = "/delete/{accountId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delClaimAccount(@PathVariable("accountId") String accountId) throws Exception {
       if(service.deleteClaimAccountInfo(accountId)){
           return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
           return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
       }
    }
}
