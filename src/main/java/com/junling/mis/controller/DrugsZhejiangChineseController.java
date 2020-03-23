package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsZhejiangChineseEntity;
import com.junling.mis.model.drugsZhejiangEntity;
import com.junling.mis.service.DrugsZhejiangChineseService;
import com.junling.mis.service.DrugsZhejiangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsZhejiangChinese")
public class DrugsZhejiangChineseController {
    @Autowired
    private DrugsZhejiangChineseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsZhejiangChinese(@RequestBody drugsZhejiangChineseEntity drugsZhejiangChineseEntity) throws Exception {
        if(service.addDrugsZhejiangChinese(drugsZhejiangChineseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
