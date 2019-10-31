package com.luzhiqing.bamboo.api.auth.vo.response;

import com.luzhiqing.bamboo.constants.enums.GenderType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/1 21:13
 */
@Data
@ApiModel("登录响应体")
public class LoginResponseVO {
    @ApiModelProperty("用户id")
    private Integer id;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("用户昵称")
    private String nickName;

    @ApiModelProperty("用户头像")
    private String avatar;

    @ApiModelProperty("性别")
    private GenderType gender;

    @ApiModelProperty("token")
    private TokenResponseVO token;
}
