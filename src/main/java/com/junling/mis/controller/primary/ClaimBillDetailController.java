package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.claimBillDetailEntity;
import com.junling.mis.model.primary.claimBillDetailEntityKey;
import com.junling.mis.service.primary.ClaimBillDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/claimBillDetail")
public class ClaimBillDetailController {

    @Autowired
    private ClaimBillDetailService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addClaimBillDetail(@RequestBody claimBillDetailEntity claimBillDetailEntity) throws Exception {
        if(service.addClaimBillDetail(claimBillDetailEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateClaimBillDetail(@RequestBody claimBillDetailEntity claimBillDetailEntity) throws Exception {
        if(service.updateClaimBillDetail(claimBillDetailEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult<claimBillDetailEntity> searchClaimBillDetail(@RequestBody claimBillDetailEntityKey key) throws Exception {
        claimBillDetailEntity claimBillDetailEntity = service.findDetailClaimBillDetail(key);
        MakeResult<claimBillDetailEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(claimBillDetailEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(claimBillDetailEntity);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult delClaimBillDetail(@RequestBody claimBillDetailEntityKey key) throws Exception {
        if(service.deleteClaimBillDetail(key)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
