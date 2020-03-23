package com.junling.mis.controller;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.drugsGuizhouChineseEntity;
import com.junling.mis.model.drugsGuizhouEntity;
import com.junling.mis.service.DrugsGuizhouChineseService;
import com.junling.mis.service.DrugsGuizhouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsGuizhoChinese")
public class DrugsGuizhouChineseController {
    @Autowired
    private DrugsGuizhouChineseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsGuizhoChinese(@RequestBody drugsGuizhouChineseEntity drugsGuizhouChineseEntity) throws Exception {
        if(service.addDrugsGuizhouChinese(drugsGuizhouChineseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
