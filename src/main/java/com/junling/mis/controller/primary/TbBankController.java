package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.TbBank;
import com.junling.mis.service.primary.TbBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbBank")
public class TbBankController {

    @Autowired
    private TbBankService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbBank(@RequestBody TbBank tbBank) throws Exception {
        if(service.addTbBank(tbBank)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbBank(@RequestBody TbBank tbBank) throws Exception {
        if(service.updateTbBank(tbBank)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{bankCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<TbBank> searchTbBank(@PathVariable("bankCode") String bankCode) throws Exception {
        TbBank tbBank = service.findDetailTbBank(bankCode);
        MakeResult<TbBank> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbBank == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbBank);
    }

    @RequestMapping(value = "/delete/{bankCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbBank(@PathVariable("bankCode") String bankCode) throws Exception {
        if(service.deleteTbBank(bankCode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
