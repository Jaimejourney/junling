package com.junling.mis.controller.primary;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.ClaimBill;
import com.junling.mis.model.primary.ClaimBillKey;
import com.junling.mis.service.primary.ClaimBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/claimBill")
public class ClaimBillController {
    @Autowired
    private ClaimBillService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addClaimBill(@RequestBody ClaimBill claimBill) throws Exception {
        if(service.addClaimBill(claimBill)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateClaimBill(@RequestBody ClaimBill claimBill) throws Exception {
        if(service.updateClaimBill(claimBill)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult<ClaimBill> searchClaimBill(@RequestBody ClaimBillKey key) throws Exception {
        ClaimBill claimBill = service.findDetailClaimBill(key);
        MakeResult<ClaimBill> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(claimBill == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(claimBill);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult delClaimBill(@RequestBody ClaimBillKey key) throws Exception {
        if(service.deleteClaimBill(key)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
