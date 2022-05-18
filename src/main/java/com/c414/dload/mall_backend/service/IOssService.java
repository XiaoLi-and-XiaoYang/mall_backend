package com.c414.dload.mall_backend.service;

import com.c414.dload.mall_backend.entity.dto.OssCallBackResult;
import com.c414.dload.mall_backend.entity.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

public interface IOssService {

    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     */
    OssCallBackResult callback(HttpServletRequest request);

}
