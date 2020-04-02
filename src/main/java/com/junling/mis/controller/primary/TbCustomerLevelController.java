package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbCustomerLevel;
import com.junling.mis.service.primary.TbCustomerLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbCustomerLevel")
public class TbCustomerLevelController {

    @Autowired
    private TbCustomerLevelService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbCustomerLevel(@RequestBody tbCustomerLevel tbCustomerLevel) throws Exception {
        if(service.addTbCustomerLevel(tbCustomerLevel)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbCustomerLevel(@RequestBody tbCustomerLevel tbCustomerLevel) throws Exception {
        if(service.updateTbCustomerLevel(tbCustomerLevel)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{customerLevelCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbCustomerLevel> searchTbCustomerLevel(@PathVariable("customerLevelCode") String customerLevelCode) throws Exception {
        tbCustomerLevel tbCustomerLevel = service.findDetailTbCustomerLevel(customerLevelCode);
        MakeResult<tbCustomerLevel> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbCustomerLevel == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbCustomerLevel);
    }

    @RequestMapping(value = "/delete/{customerLevelCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbCustomerLevel(@PathVariable("customerLevelCode") String customerLevelCode) throws Exception {
        if(service.deleteTbCustomerLevel(customerLevelCode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
