package com.luzhiqing.bamboo.api.biz.vo.request;

import com.luzhiqing.bamboo.constants.enums.ExpressCompanyType;
import com.luzhiqing.bamboo.constants.enums.OrderType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ExpressOrderRequestVO implements Serializable {
    private String             expressNumber;
    private ExpressCompanyType expressCompany;
    private String             phone;
    private String             address;
    private String             studentName;
    private LocalDateTime      accessDay;
    private String             accessNumber;
    private OrderType          orderType;
    private String             remark;
}
