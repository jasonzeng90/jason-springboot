package com.rockfintech.reas.xabank.controller;

import com.rockfintech.reas.xabank.common.res.ComResponse;
import com.rockfintech.reas.xabank.entity.XaLog;
import com.rockfintech.reas.xabank.service.IXaLogService;
import com.rockfintech.reas.xabank.vo.req.XaReqTestVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: zengsheng
 * @Date: 2018/9/29
 * @Description: 新安核心通讯
 * @Company: rockfintech
 * @Copyright:Copyright(c)2018) Version:1.0.1
 */
@RestController
@RequestMapping("xalog/")
public class XinAnLogController extends BaseController{

    @Autowired
    private IXaLogService xaLogService;

    /**
     * Description: 测试
     * @param vo    请求实体必须要有get和set方法，因为拦截器通过此方法进行校验
     * @return: com.rockfintech.reas.xabank.common.res.ComResponse
     * @auther: zengsheng
     * @date: 2018/9/29
     */
    @ApiOperation(value = "获取通讯日志信息",notes = "根据xaLogId查找具体的一条通讯信息")
//    @ApiImplicitParam(name = "vo", value = "获取日志请求实体", required = true, dataType = "XaReqTestVo") 请求实体不能对每个参数说明
    @PostMapping("getXalog")//要指定请求类型post,get等，不然生成的swagger 会多个方法
    public ComResponse getXinAnLog(XaReqTestVo vo) throws Exception{
        ComResponse comResponse = new ComResponse();
        XaLog xaLog = xaLogService.selectByPrimaryKey(vo.getXaLogId());
        comResponse.setMsg("查询成功");
        comResponse.setData(xaLog);

        return comResponse;
    }
}
