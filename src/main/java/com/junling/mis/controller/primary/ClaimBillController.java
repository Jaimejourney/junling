package com.junling.mis.controller.primary;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.claimBill;
import com.junling.mis.model.primary.claimBillKey;
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
    public MakeResult addClaimBill(@RequestBody claimBill claimBill) throws Exception {
        if(service.addClaimBill(claimBill)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateClaimBill(@RequestBody claimBill claimBill) throws Exception {
        if(service.updateClaimBill(claimBill)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult<claimBill> searchClaimBill(@RequestBody claimBillKey key) throws Exception {
        claimBill claimBill = service.findDetailClaimBill(key);
        MakeResult<claimBill> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(claimBill == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(claimBill);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult delClaimBill(@RequestBody claimBillKey key) throws Exception {
        if(service.deleteClaimBill(key)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
