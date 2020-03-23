package com.junling.mis.controller;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.tbCwfNodeEntity;
import com.junling.mis.model.tbDistrictEntity;
import com.junling.mis.service.TbCwfNodeService;
import com.junling.mis.service.TbDistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbDistrict")
public class TbDistrictController {

    @Autowired
    private TbDistrictService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbDistrict(@RequestBody tbDistrictEntity tbDistrictEntity) throws Exception {
        if(service.addTbDistrict(tbDistrictEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }
}
