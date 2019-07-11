package com.rockfintech.reas.springboot.controller;

import com.rockfintech.reas.springboot.common.res.ComResponse;
import com.rockfintech.reas.springboot.entity.XaLog;
import com.rockfintech.reas.springboot.service.IXaLogService;
import com.rockfintech.reas.springboot.vo.req.XaReqTestVo;
import io.swagger.annotations.*;
import org.apache.logging.log4j.core.util.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @Auther: zengsheng
 * @Date: 2018/9/29
 * @Description: 新安核心通讯
 * @Company: rockfintech
 * @Copyright:Copyright(c)2018) Version:1.0.1
 */
@RestController
@RequestMapping("xalog/")
@Api(value = "新安通讯", description = "新安通讯")
public class XinAnLogController extends BaseController{

    @Autowired
    private IXaLogService xaLogService;

    /**
     * Description: 测试
     * @param vo    请求实体必须要有get和set方法，因为拦截器通过此方法进行校验
     * @return: com.rockfintech.reas.springboot.common.res.ComResponse
     * @auther: zengsheng
     * @date: 2018/9/29
     */
    //swagger要指定请求类型post,get等，不然生成的swagger 会多个方法
    //1.swagger请求实体字段可以用@ApiModelProperty注解字段描述
    //2.返回类型在类上面加@ApiModel，并且返回对象用泛型，这样在swagger返回的JSON中能看见示例的返回DATA的具体类型；
    //  返回的data的类型加上@ApiModelProperty可以注解字段信息； 最好不要用POJO，增改表字段的时候新生成的POJO会覆盖字段描述；
    @ApiOperation(value = "获取通讯日志信息",notes = "根据xaLogId查找具体的一条通讯信息")
    @PostMapping("getXalog")
    public ComResponse<XaLog> getXinAnLog(XaReqTestVo vo) throws Exception{
        ComResponse<XaLog> comResponse = new ComResponse();
        XaLog xaLog = xaLogService.selectByPrimaryKey(vo.getXaLogId());
        comResponse.setMsg("查询成功");
        comResponse.setData(xaLog);

        return comResponse;
    }

    @PostMapping("addXalog")
    public ComResponse<XaReqTestVo> addXinAnLog(XaReqTestVo vo) throws Exception{
        ComResponse<XaReqTestVo> comResponse = new ComResponse();
        XaLog xaLog = new XaLog();
        xaLog.setXalogId(UUID.randomUUID().toString().replaceAll("-",""));
        xaLogService.insertParams(xaLog);
        comResponse.setMsg("操作成功");
        comResponse.setData(vo);

        return comResponse;
    }
}
