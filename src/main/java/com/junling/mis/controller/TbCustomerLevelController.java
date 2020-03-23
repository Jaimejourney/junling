package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.tbCompanyNatureEntity;
import com.junling.mis.model.tbCustomerLevelEntity;
import com.junling.mis.service.TbCompanyNatureService;
import com.junling.mis.service.TbCustomerLevelService;
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
    public MakeResult addTbCustomerLevel(@RequestBody tbCustomerLevelEntity tbCustomerLevelEntity) throws Exception {
        if(service.addTbCustomerLevel(tbCustomerLevelEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbCustomerLevel(@RequestBody tbCustomerLevelEntity tbCustomerLevelEntity) throws Exception {
        if(service.updateTbCustomerLevel(tbCustomerLevelEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{customerLevelCode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbCustomerLevelEntity> searchTbCustomerLevel(@PathVariable("customerLevelCode") String customerLevelCode) throws Exception {
        tbCustomerLevelEntity tbCustomerLevelEntity = service.findDetailTbCustomerLevel(customerLevelCode);
        MakeResult<tbCustomerLevelEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbCustomerLevelEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbCustomerLevelEntity);
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
