package com.luzhiqing.bamboo.api.biz.controller;

import com.luzhiqing.bamboo.api.biz.vo.request.ExpressOrderRequestVO;
import com.luzhiqing.bamboo.remote.client.ExpressOrderRemote;
import com.luzhiqing.bamboo.remote.dto.ExpressOrderDTO;
import com.luzhiqing.common.util.BeanUtil;
import com.luzhiqing.bamboo.api.biz.vo.response.ExpressOrderResponseVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/user")
@RestController
public class ExpressOrderController {

    @Autowired
    private ExpressOrderRemote expressOrderRemote;
    /**
     * 下单
     * @param orderRequestVO
     * @return
     */
    @ApiOperation("下单")
    @RequestMapping(value = "/v1/express/order",method = RequestMethod.POST)
    public ExpressOrderResponseVO placeOrder(ExpressOrderRequestVO orderRequestVO){
        ExpressOrderDTO expressOrderDTO = BeanUtil.map(orderRequestVO,ExpressOrderDTO.class);
        return BeanUtil.map(expressOrderRemote.placeOrder(expressOrderDTO),ExpressOrderResponseVO.class) ;
    }
}
