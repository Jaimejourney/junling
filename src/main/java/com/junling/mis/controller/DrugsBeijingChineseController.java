package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsBeijingChineseEntity;
import com.junling.mis.model.drugsBeijingEntity;
import com.junling.mis.service.DrugsBeijingChineseService;
import com.junling.mis.service.DrugsBeijingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsBeijingChinese")
public class DrugsBeijingChineseController {
    @Autowired
    private DrugsBeijingChineseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsBeijingChinese(@RequestBody drugsBeijingChineseEntity drugsBeijingChineseEntity) throws Exception {
        if(service.addDrugsBeijingChinese(drugsBeijingChineseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
