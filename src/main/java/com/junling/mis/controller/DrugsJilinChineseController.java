package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsJilinChineseEntity;
import com.junling.mis.model.drugsJilinEntity;
import com.junling.mis.service.DrugsJilinChineseService;
import com.junling.mis.service.DrugsJilinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsJilinChinese")
public class DrugsJilinChineseController {
    @Autowired
    private DrugsJilinChineseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsJilinChinese(@RequestBody drugsJilinChineseEntity drugsJilinChineseEntity) throws Exception {
        if(service.addDrugsJilinChinese(drugsJilinChineseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
