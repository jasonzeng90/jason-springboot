package com.rockfintech.reas.xabank.vo.req;

import com.rockfintech.reas.xabank.checker.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Auther: zengsheng
 * @Date: 2018/9/29
 * @Description: TODO
 * @Company: rockfintech
 * @Copyright:Copyright(c)2018) Version:1.0.1
 */

@ApiModel(value="XaReqTestVo对象",description="新安通讯查询日志请求实体")
public class XaReqTestVo extends ReqBase {

    @NotNull
    @ApiModelProperty(value="用户名",name="xaLogId",required = true,example="15f3eeec82244375b6a6456818044bf5")
    private String xaLogId;

    public String getXaLogId() {
        return xaLogId;
    }

    public void setXaLogId(String xaLogId) {
        this.xaLogId = xaLogId;
    }
}
