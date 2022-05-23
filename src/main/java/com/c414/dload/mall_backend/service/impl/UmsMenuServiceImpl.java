package com.c414.dload.mall_backend.service.impl;

import com.c414.dload.mall_backend.entity.UmsMenu;
import com.c414.dload.mall_backend.mapper.UmsMenuMapper;
import com.c414.dload.mall_backend.service.IUmsMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台菜单表 服务实现类
 * </p>
 *
 * @author dload
 * @since 2022-05-23
 */
@Service
public class UmsMenuServiceImpl extends ServiceImpl<UmsMenuMapper, UmsMenu> implements IUmsMenuService {

    @Resource
    private UmsMenuMapper umsMenuMapper;

    @Override
    public List<UmsMenu> getMenuList(Long adminId) {
        return umsMenuMapper.selectMenuListById(adminId);
    }
}
