package com.c414.dload.mall_backend.entity.dto;

import lombok.Data;

@Data
public class PageRequest {
    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;
}
