package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.claimInfo;
import com.junling.mis.model.primary.claimInfoKey;
import com.junling.mis.service.primary.ClaimInfoService;
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
    public MakeResult addClaimInfo(@RequestBody claimInfo claimInfo) throws Exception {
        if(service.addClaimInfo(claimInfo)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateClaimInfo(@RequestBody claimInfo claimInfo) throws Exception {
        if(service.updateClaimInfo(claimInfo)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult<claimInfo> searchClaimInfo(@RequestBody claimInfoKey key) throws Exception {
        claimInfo claimInfo = service.findDetailClaimInfo(key);
        MakeResult<claimInfo> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(claimInfo == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(claimInfo);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult delClaimInfo(@RequestBody claimInfoKey key) throws Exception {
        if(service.deleteClaimInfo(key)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }
}
