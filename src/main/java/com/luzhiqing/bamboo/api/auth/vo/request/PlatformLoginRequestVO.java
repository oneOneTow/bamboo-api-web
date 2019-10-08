package com.luzhiqing.bamboo.api.auth.vo.request;


import com.luzhiqing.bamboo.constants.enums.PlatformType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/1 21:48
 */
@ApiModel
@Data
public class PlatformLoginRequestVO {

    @ApiModelProperty("第三方类型")
    private PlatformType type;

    @ApiModelProperty("第三方平台id")
    private String platformId;

    @ApiModelProperty("第三方平台token")
    private String platformToken;

}
