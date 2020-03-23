package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsQinghaiEntity;
import com.junling.mis.model.drugsShandongEntity;
import com.junling.mis.service.DrugsQinghaiService;
import com.junling.mis.service.DrugsShandongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsShandong")
public class DrugsShandongController {
    @Autowired
    private DrugsShandongService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsShandong(@RequestBody drugsShandongEntity drugsShandongEntity) throws Exception {
        if(service.addDrugsShandong(drugsShandongEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
