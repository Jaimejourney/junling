package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsFujianChineseEntity;
import com.junling.mis.model.drugsFujianEntity;
import com.junling.mis.service.DrugsFujianChineseService;
import com.junling.mis.service.DrugsFujianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsFujianChinese")
public class DrugsFujianChineseController {
    @Autowired
    private DrugsFujianChineseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsFujianChinese(@RequestBody drugsFujianChineseEntity drugsFujianChineseEntity) throws Exception {
        if(service.addDrugsFujianChinese(drugsFujianChineseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
