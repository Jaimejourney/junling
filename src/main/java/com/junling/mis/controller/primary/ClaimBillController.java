package com.junling.mis.controller.primary;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.claimBillEntity;
import com.junling.mis.model.primary.claimBillEntityKey;
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
    public MakeResult addClaimBill(@RequestBody claimBillEntity claimBillEntity) throws Exception {
        if(service.addClaimBill(claimBillEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateClaimBill(@RequestBody claimBillEntity claimBillEntity) throws Exception {
        if(service.updateClaimBill(claimBillEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult<claimBillEntity> searchClaimBill(@RequestBody claimBillEntityKey key) throws Exception {
        claimBillEntity claimBillEntity = service.findDetailClaimBill(key);
        MakeResult<claimBillEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(claimBillEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(claimBillEntity);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult delClaimBill(@RequestBody claimBillEntityKey key) throws Exception {
        if(service.deleteClaimBill(key)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
