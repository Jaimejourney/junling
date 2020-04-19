package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.ClaimBillDetail;
import com.junling.mis.model.primary.ClaimBillDetailKey;
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
    public MakeResult addClaimBillDetail(@RequestBody ClaimBillDetail claimBillDetail) throws Exception {
        if(service.addClaimBillDetail(claimBillDetail)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateClaimBillDetail(@RequestBody ClaimBillDetail claimBillDetail) throws Exception {
        if(service.updateClaimBillDetail(claimBillDetail)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult<ClaimBillDetail> searchClaimBillDetail(@RequestBody ClaimBillDetailKey key) throws Exception {
        ClaimBillDetail claimBillDetail = service.findDetailClaimBillDetail(key);
        MakeResult<ClaimBillDetail> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(claimBillDetail == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(claimBillDetail);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult delClaimBillDetail(@RequestBody ClaimBillDetailKey key) throws Exception {
        if(service.deleteClaimBillDetail(key)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
