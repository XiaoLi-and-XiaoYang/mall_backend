package com.c414.dload.mall_backend.service;

import com.c414.dload.mall_backend.entity.UmsAdmin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.c414.dload.mall_backend.entity.UmsPermission;

import java.util.List;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author dload
 * @since 2022-05-11
 */
public interface IUmsAdminService extends IService<UmsAdmin> {

    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     *
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);

}
