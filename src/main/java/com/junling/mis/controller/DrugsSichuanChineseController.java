package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsSichuanChineseEntity;
import com.junling.mis.model.drugsSichuanEntity;
import com.junling.mis.service.DrugsSichuanChineseService;
import com.junling.mis.service.DrugsSichuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsSichuanChinese")
public class DrugsSichuanChineseController {
    @Autowired
    private DrugsSichuanChineseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsSichuanChinese(@RequestBody drugsSichuanChineseEntity drugsSichuanChineseEntity) throws Exception {
        if(service.addDrugsSichuanChinese(drugsSichuanChineseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
