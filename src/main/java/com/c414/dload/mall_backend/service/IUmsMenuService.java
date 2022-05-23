package com.c414.dload.mall_backend.service;

import com.c414.dload.mall_backend.entity.UmsMenu;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 后台菜单表 服务类
 * </p>
 *
 * @author dload
 * @since 2022-05-23
 */
public interface IUmsMenuService extends IService<UmsMenu> {

    public List<UmsMenu> getMenuList(Long adminId);

}
