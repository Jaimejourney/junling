package com.junling.mis.controller.primary;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.drugsAnhuiChineseEntity;
import com.junling.mis.service.primary.DrugsAnhuiChineseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsAnhuiChinese")
public class DrugsAnhuiChineseController {
    @Autowired
    private DrugsAnhuiChineseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugAnhuiChinese(@RequestBody drugsAnhuiChineseEntity drugsAnhuiChineseEntity) throws Exception {
        if(service.addDrugsAnhuiChinese(drugsAnhuiChineseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}