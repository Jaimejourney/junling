package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsTianjinChineseEntity;
import com.junling.mis.model.drugsTianjinEntity;
import com.junling.mis.service.DrugsTianjinChineseService;
import com.junling.mis.service.DrugsTianjinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsTianjinChinese")
public class DrugsTianjinChineseController {
    @Autowired
    private DrugsTianjinChineseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsTianjinChinese(@RequestBody drugsTianjinChineseEntity drugsTianjinChineseEntity) throws Exception {
        if(service.addDrugsTianjinChinese(drugsTianjinChineseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
