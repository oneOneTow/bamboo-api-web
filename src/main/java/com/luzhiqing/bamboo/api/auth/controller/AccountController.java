package com.luzhiqing.bamboo.api.auth.controller;


import com.luzhiqing.bamboo.api.auth.vo.request.LoginRequestVO;
import com.luzhiqing.bamboo.api.auth.vo.request.PlatformLoginRequestVO;
import com.luzhiqing.bamboo.api.auth.vo.request.RegisterRequestVO;
import com.luzhiqing.bamboo.api.auth.vo.response.LoginResponseVO;
import com.luzhiqing.bamboo.remote.client.AccountRemote;
import com.luzhiqing.bamboo.remote.dto.RegisterDTO;
import com.luzhiqing.common.util.BeanUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/1 21:08
 */
@RestController
@RequestMapping(value = "/user")
public class AccountController {

    @Autowired
    AccountRemote accountRemote;
    /**
     * 注册账号
     *
     * @param registerRequestVO
     * @return 注册账号主键
     */
    @ApiOperation("注册用户")
    @RequestMapping(value = "/v1/auth/account/register",method = RequestMethod.POST)
    public void register(RegisterRequestVO registerRequestVO) {
        RegisterDTO registerDTO = BeanUtil.map(registerRequestVO,RegisterDTO.class);
        accountRemote.register(registerDTO);
    }

    /**
     * 用户登录
     *
     * @param loginRequestVO
     * @return token
     */
    @ApiOperation("用户登录")
    @RequestMapping(value = "/v1/auth/account/login",method = RequestMethod.POST)
    public LoginResponseVO login(LoginRequestVO loginRequestVO) {
        return null;
    }

    /**
     * 第三方登录
     *
     * @param loginRequestVO
     * @return token
     */
    @ApiOperation("用户登录")
    @RequestMapping(value = "/v1/auth/account/platform/login",method = RequestMethod.POST)
    public LoginResponseVO login(PlatformLoginRequestVO loginRequestVO) {
        return null;
    }
}
