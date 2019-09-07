package com.luzhiqing.bamboo.api.biz.vo.response;

import com.luzhiqing.bamboo.constants.enums.ExpressCompanyType;
import com.luzhiqing.bamboo.constants.enums.OrderType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@ApiModel
public class ExpressOrderResponseVO implements Serializable {

    @ApiModelProperty("订单编号")
    private Integer            id;
    @ApiModelProperty("用户编号")
    private Integer            userId;
    @ApiModelProperty("快递单号")
    private String             expressNumber;
    @ApiModelProperty("快递公司")
    private ExpressCompanyType expressCompany;
    @ApiModelProperty("电话")
    private String             phone;
    @ApiModelProperty("地址")
    private String             address;
    @ApiModelProperty("姓名")
    private String             studentName;
    @ApiModelProperty("取件时间")
    private LocalDateTime      accessDay;
    @ApiModelProperty("取件号")
    private String             accessNumber;
    @ApiModelProperty("订单类型")
    private OrderType          orderType;
    @ApiModelProperty("备注")
    private String             remark;
}
