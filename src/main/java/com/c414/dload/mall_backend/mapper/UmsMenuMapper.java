package com.c414.dload.mall_backend.mapper;

import com.c414.dload.mall_backend.entity.UmsMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 后台菜单表 Mapper 接口
 * </p>
 *
 * @author dload
 * @since 2022-05-23
 */
@Mapper
public interface UmsMenuMapper extends BaseMapper<UmsMenu> {

    public List<UmsMenu> selectMenuListById(@Param("adminId") Long adminId);

}
