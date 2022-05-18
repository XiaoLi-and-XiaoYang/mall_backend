package com.c414.dload.mall_backend.service;

import com.c414.dload.mall_backend.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * 会员浏览记录管理Service
 * Created by dlo on 2018/8/3.
 */
public interface IMemberReadHistoryService {

    /**
     * 生成浏览记录
     */
    Integer create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    Integer delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     */
    List<MemberReadHistory> list(Long memberId);

}
