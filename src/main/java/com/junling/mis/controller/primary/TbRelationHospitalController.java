package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbRelationHospitalEntity;
import com.junling.mis.service.primary.TbRelationHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbRelationHospital")
public class TbRelationHospitalController {

    @Autowired
    private TbRelationHospitalService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbRelationHospital(@RequestBody tbRelationHospitalEntity tbRelationHospitalEntity) throws Exception {
        if(service.addTbRelationHospital(tbRelationHospitalEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }
}
