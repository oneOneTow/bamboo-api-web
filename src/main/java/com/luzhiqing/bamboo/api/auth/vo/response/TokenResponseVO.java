package com.luzhiqing.bamboo.api.auth.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/1 22:42
 */
@ApiModel
@Data
public class TokenResponseVO {

    @ApiModelProperty("token字符串")
    private String token;

    @ApiModelProperty("过期时间")
    private Long expiration;
}
