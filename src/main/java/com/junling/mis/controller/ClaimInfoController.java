package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.*;
import com.junling.mis.service.ClaimInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/claimInfo")
public class ClaimInfoController {

    @Autowired
    private ClaimInfoService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addClaimInfo(@RequestBody claimInfoEntity claimInfoEntity) throws Exception {
        if(service.addClaimInfo(claimInfoEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateClaimInfo(@RequestBody claimInfoEntity claimInfoEntity) throws Exception {
        if(service.updateClaimInfo(claimInfoEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult<claimInfoEntity> searchClaimInfo(@RequestBody claimInfoEntityKey key) throws Exception {
        claimInfoEntity claimInfoEntity = service.findDetailClaimInfo(key);
        MakeResult<claimInfoEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(claimInfoEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(claimInfoEntity);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult delClaimInfo(@RequestBody claimInfoEntityKey key) throws Exception {
        if(service.deleteClaimInfo(key)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }
}
