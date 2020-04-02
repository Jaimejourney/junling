package com.junling.mis.controller.primary;

import com.junling.mis.common.constants.ResultStatus;
import com.junling.mis.common.result.MakeResult;
import com.junling.mis.model.primary.tbCwfNode;
import com.junling.mis.service.primary.TbCwfNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/tbCwfNode")
public class TbCwfNodeController {

    @Autowired
    private TbCwfNodeService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult addTbCwfNode(@RequestBody tbCwfNode tbCwfNode) throws Exception {
        if(service.addTbCwfNode(tbCwfNode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public MakeResult updateTbCwfNode(@RequestBody tbCwfNode tbCwfNode) throws Exception {
        if(service.updateTbCwfNode(tbCwfNode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

    @RequestMapping(value = "/search/{cwfNode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult<tbCwfNode> searchTbCwfNode(@PathVariable("cwfNode") String cwfNode) throws Exception {
        tbCwfNode tbCwfNode = service.findDetailTbCwfNode(cwfNode);
        MakeResult<tbCwfNode> result = MakeResult.createResult(ResultStatus.OK_CODE);
        if(tbCwfNode == null){
            result.setCode(ResultStatus.ERROR_RESULT);
        }
        return result.addResults(tbCwfNode);
    }

    @RequestMapping(value = "/delete/{cwfNode}", method = RequestMethod.GET)
    @ResponseBody
    public MakeResult delTbCwfNode(@PathVariable("cwfNode") String cwfNode) throws Exception {
        if(service.deleteTbCwfNode(cwfNode)){
            return MakeResult.createResult(ResultStatus.OK_CODE);
        }else{
            return MakeResult.createResult(ResultStatus.OK_WITH_DATA_ERROR);
        }
    }

}
