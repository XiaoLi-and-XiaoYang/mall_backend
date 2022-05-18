package com.c414.dload.mall_backend.service;

import com.c414.dload.mall_backend.common.CommonResult;
import com.c414.dload.mall_backend.entity.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

public interface IOmsPortalOrderService {

    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);

}
