package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsChongqingChineseEntity;
import com.junling.mis.model.drugsChongqingEntity;
import com.junling.mis.service.DrugsChongqingChineseService;
import com.junling.mis.service.DrugsChongqingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsChongqingChinese")
public class DrugsChongqingChineseController {
    @Autowired
    private DrugsChongqingChineseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsChongqingChinese(@RequestBody drugsChongqingChineseEntity drugsChongqingChineseEntity) throws Exception {
        if(service.addDrugsChongqingChinese(drugsChongqingChineseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
