package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsYunnanChineseEntity;
import com.junling.mis.model.drugsYunnanEntity;
import com.junling.mis.service.DrugsYunnanChineseService;
import com.junling.mis.service.DrugsYunnanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsYunnanChinese")
public class DrugsYunnanChineseController {
    @Autowired
    private DrugsYunnanChineseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsYunnanChinese(@RequestBody drugsYunnanChineseEntity drugsYunnanChineseEntity) throws Exception {
        if(service.addDrugsYunnanChinese(drugsYunnanChineseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
