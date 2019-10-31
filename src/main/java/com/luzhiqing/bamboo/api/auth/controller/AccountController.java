package com.luzhiqing.bamboo.api.auth.controller;


import com.luzhiqing.bamboo.api.auth.vo.response.TokenResponseVO;
import com.luzhiqing.bamboo.remote.client.AccountRemote;
import com.luzhiqing.bamboo.remote.dto.TokenDTO;
import com.luzhiqing.common.token.User;
import com.luzhiqing.common.util.BeanUtil;
import com.luzhiqing.common.util.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/1 21:08
 */
@RestController
@RequestMapping(value = "/mp")
public class AccountController {

    @Autowired
    AccountRemote accountRemote;

    /**
     * 登录
     *
     * @param appId
     * @param code
     * @return
     */
    @RequestMapping(value = "/auth/account/login/{appId}", method = RequestMethod.GET)
    TokenResponseVO mpLogin(@PathVariable String appId, @RequestParam String code) {
        TokenDTO tokenDTO = accountRemote.mpLogin(appId, code);
        return BeanUtils.map(tokenDTO, TokenResponseVO.class);
    }

    /**
     * 获取user信息
     *
     * @param appId
     * @param sessionKey
     * @param signature
     * @param rawData
     * @param encryptedData
     * @param iv
     * @return
     */
    @RequestMapping(value = "/auth/account/user/{appId}", method = RequestMethod.GET)
    public User fetchUser(@PathVariable String appId,
                          @RequestParam String uid,
                          @RequestParam String signature,
                          @RequestParam String rawData,
                          @RequestParam String encryptedData,
                          @RequestParam String iv) {
        User user = accountRemote.fetchUser(appId, uid, signature, rawData, encryptedData, iv);
        return user;
    }
}
