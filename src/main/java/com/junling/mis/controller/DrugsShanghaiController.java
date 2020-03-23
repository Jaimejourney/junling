package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsShanghaiChineseEntity;
import com.junling.mis.model.drugsShanghaiEntity;
import com.junling.mis.service.DrugsShanghaiChineseService;
import com.junling.mis.service.DrugsShanghaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsShanghai")
public class DrugsShanghaiController {
    @Autowired
    private DrugsShanghaiService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsShanghai(@RequestBody drugsShanghaiEntity drugsShanghaiEntity) throws Exception {
        if(service.addDrugsShanghai(drugsShanghaiEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
