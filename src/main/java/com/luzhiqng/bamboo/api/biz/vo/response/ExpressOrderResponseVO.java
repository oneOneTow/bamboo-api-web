package com.luzhiqng.bamboo.api.biz.vo.response;

import com.luzhiqing.bamboo.constants.enums.ExpressCompanyType;
import com.luzhiqing.bamboo.constants.enums.OrderType;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ExpressOrderResponseVO implements Serializable {

    private Integer            id;
    private Integer            userId;
    private String             expressNumber;
    private String             expressCompanyName;
    private ExpressCompanyType expressCompany;
    private String             phone;
    private String             address;
    private String             studentName;
    private LocalDateTime      accessDay;
    private String             accessNumber;
    private OrderType          orderType;
    private String             orderTypeName;
    private String             remark;
    private LocalDateTime      createTime;
    private Integer            createUser;
    private String             createUserName;
    private LocalDateTime      updateTime;
    private Integer            updateUser;
    private String             updateUserName;
    private LocalDateTime      deleteTime;
    private Integer            deleteUser;
    private String             deleteUserName;
    private Byte               enabled;

}
