package com.c414.dload.mall_backend.controller;

import com.c414.dload.mall_backend.common.CommonResult;
import com.c414.dload.mall_backend.entity.dto.OssCallBackResult;
import com.c414.dload.mall_backend.entity.dto.OssPolicyResult;
import com.c414.dload.mall_backend.service.impl.OssServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.http.impl.bootstrap.HttpServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@Api(tags = "OssController", description = "文件上传OSS(aliyun)接口")
@RequestMapping("/aliyun/oss")
public class OssController {

    @Resource
    private OssServiceImpl ossService;

    @GetMapping("/policy")
    @ApiOperation("oss上传签名生成")
    public CommonResult policy(){
        OssPolicyResult policy = ossService.policy();
        return CommonResult.success(policy);
    }

    @PostMapping("/callback")
    @ApiOperation("oss上传成功回调")
    public CommonResult callback(HttpServletRequest request){
        OssCallBackResult callback = ossService.callback(request);
        return CommonResult.success(callback);
    }

}
