package com.junling.mis.controller.primary;


import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.drugsHeilongjiangChineseEntity;
import com.junling.mis.service.primary.DrugsHeilongjiangChineseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/DrugsHeilongjiangChinese")
public class DrugsHeilongjiangChineseController {
    @Autowired
    private DrugsHeilongjiangChineseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addDrugsHeilongjiangChinese(@RequestBody drugsHeilongjiangChineseEntity drugsHeilongjiangChineseEntity) throws Exception {
        if(service.addDrugsHeilongjiangChinese(drugsHeilongjiangChineseEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
