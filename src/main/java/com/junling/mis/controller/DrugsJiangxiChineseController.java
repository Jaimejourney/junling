package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsJiangxiChineseEntity;
import com.junling.mis.model.drugsJiangxiEntity;
import com.junling.mis.service.DrugsJiangxiChineseService;
import com.junling.mis.service.DrugsJiangxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsJiangxiChinese")
public class DrugsJiangxiChineseController {
    @Autowired
    private DrugsJiangxiChineseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsJiangxiChinese(@RequestBody drugsJiangxiChineseEntity drugsJiangxiChineseEntity) throws Exception {
        if(service.addDrugsJiangxiChinese(drugsJiangxiChineseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
