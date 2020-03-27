package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbBaseHospitalCopyEntity;
import com.junling.mis.service.primary.TbBaseHospitalCopyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbBaseHospitalCopy")
public class TbBaseHospitalCopyController {

    @Autowired
    private TbBaseHospitalCopyService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbBaseHospitalCopy(@RequestBody tbBaseHospitalCopyEntity tbBaseHospitalCopyEntity) throws Exception {
        if(service.addTbBaseHospitalCopy(tbBaseHospitalCopyEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbBaseHospitalCopy(@RequestBody tbBaseHospitalCopyEntity tbBaseHospitalCopyEntity) throws Exception {
        if(service.updateTbBaseHospitalCopy(tbBaseHospitalCopyEntity)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{hospitalId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbBaseHospitalCopyEntity> searchTbBaseHospitalCopy(@PathVariable("hospitalId") Integer hospitalId) throws Exception {
        tbBaseHospitalCopyEntity tbBaseHospitalCopyEntity = service.findDetailTbBaseHospitalCopy(hospitalId);
        MakeResult<tbBaseHospitalCopyEntity> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbBaseHospitalCopyEntity == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbBaseHospitalCopyEntity);
    }

    @RequestMapping(value = "/delete/{hospitalId}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbBaseHospitalCopy(@PathVariable("hospitalId") Integer hospitalId) throws Exception {
        if(service.deleteTbBaseHospitalCopy(hospitalId)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
