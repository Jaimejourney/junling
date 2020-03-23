package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsXinjiangChineseEntity;
import com.junling.mis.model.drugsXinjiangEntity;
import com.junling.mis.service.DrugsXinjiangChineseService;
import com.junling.mis.service.DrugsXinjiangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsXinjiangChinese")
public class DrugsXinjiangChineseController {
    @Autowired
    private DrugsXinjiangChineseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsXinjiangChinese(@RequestBody drugsXinjiangChineseEntity drugsXinjiangChineseEntity) throws Exception {
        if(service.addDrugsXinjiangChinese(drugsXinjiangChineseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
