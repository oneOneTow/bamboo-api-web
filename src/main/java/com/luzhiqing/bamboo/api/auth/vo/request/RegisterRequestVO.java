package com.luzhiqing.bamboo.api.auth.vo.request;

import com.luzhiqing.bamboo.constants.enums.RegisterType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/1 21:12
 */
@Data
@ApiModel(value = "注册请求体")
public class RegisterRequestVO {

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("邮箱")
    private String emile;

    @ApiModelProperty("注册方式")
    private RegisterType type;

    @ApiModelProperty("验证码")
    private String code;

}
