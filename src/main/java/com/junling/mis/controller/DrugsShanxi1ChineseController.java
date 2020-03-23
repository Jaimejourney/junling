package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsShanxi1ChineseEntity;
import com.junling.mis.model.drugsShanxiEntity;
import com.junling.mis.service.DrugsShanxi1ChineseService;
import com.junling.mis.service.DrugsShanxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsShanxi1Chinese")
public class DrugsShanxi1ChineseController {
    @Autowired
    private DrugsShanxi1ChineseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsShanxi1Chinese(@RequestBody drugsShanxi1ChineseEntity drugsShanxi1ChineseEntity) throws Exception {
        if(service.addDrugsShanxi1Chinese(drugsShanxi1ChineseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
