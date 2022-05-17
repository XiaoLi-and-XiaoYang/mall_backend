package com.c414.dload.mall_backend.controller;


import com.c414.dload.mall_backend.common.CommonResult;
import com.c414.dload.mall_backend.entity.UmsAdmin;
import com.c414.dload.mall_backend.entity.UmsAdminLoginParam;
import com.c414.dload.mall_backend.entity.UmsPermission;
import com.c414.dload.mall_backend.service.impl.UmsAdminServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * 后台用户表 前端控制器
 * </p>
 *
 * @author dload
 * @since 2022-05-11
 */
@RestController
@Api(tags = "UmsAdminController", description = "后台用户管理")
@RequestMapping("/admin")
public class UmsAdminController {

    @Resource
    private UmsAdminServiceImpl umsAdminService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @PostMapping("/register")
    @ApiOperation("用户注册")
    public CommonResult register(@RequestBody UmsAdmin umsAdminParam, BindingResult bindingResult) {

        UmsAdmin umsAdmin = umsAdminService.register(umsAdminParam);
        if (umsAdmin == null) {
            CommonResult.failed();
        }
        return CommonResult.success(umsAdmin);

    }

    @ApiOperation("登陆&返回token")
    @PostMapping("/login")
    public CommonResult login(@RequestBody UmsAdminLoginParam umsAdminLoginParam, BindingResult bindingResult) {

        String token = umsAdminService.login(umsAdminLoginParam.getUsername(), umsAdminLoginParam.getPassword());
        if (token == null) {
            return CommonResult.validFailed("用户名或密码错误");
        }
        HashMap<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation("获取Admin权限信息")
    @GetMapping("/permission/{adminId}")
    public CommonResult getPermissionList(@PathVariable String adminId) {
        List<UmsPermission> permissionList = umsAdminService.getPermissionList(Long.valueOf(adminId));
        return CommonResult.success(permissionList);
    }

}
