package com.c414.dload.mall_backend.service;

import com.c414.dload.mall_backend.common.CommonResult;

public interface IUmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
