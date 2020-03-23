package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsJiangsuChineseEntity;
import com.junling.mis.model.drugsJiangsuEntity;
import com.junling.mis.service.DrugsJiangsuChineseService;
import com.junling.mis.service.DrugsJiangsuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsJiangsuChinese")
public class DrugsJiangsuChineseController {
    @Autowired
    private DrugsJiangsuChineseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsJiangsuChinese(@RequestBody drugsJiangsuChineseEntity drugsJiangsuChineseEntity) throws Exception {
        if(service.addDrugsJiangsuChinese(drugsJiangsuChineseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
