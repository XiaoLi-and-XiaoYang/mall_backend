package com.c414.dload.mall_backend.controller;

import com.c414.dload.mall_backend.common.CommonResult;
import com.c414.dload.mall_backend.entity.dto.OrderParam;
import com.c414.dload.mall_backend.service.impl.OmsPortalOrderServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "OmsPortalOrderController", description = "订单管理接口")
@RequestMapping("/order")
public class OmsPortalOrderController {

    @Resource
    private OmsPortalOrderServiceImpl omsPortalOrderService;

    @PostMapping("/generate")
    @ApiOperation("产生订单接口")
    public CommonResult generateOder(@RequestBody OrderParam orderParam){
        return omsPortalOrderService.generateOrder(orderParam);
    }

}
