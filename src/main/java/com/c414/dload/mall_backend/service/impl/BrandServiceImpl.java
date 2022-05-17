package com.c414.dload.mall_backend.service.impl;

import com.c414.dload.mall_backend.entity.dto.Brand;
import com.c414.dload.mall_backend.mapper.BrandMapper;
import com.c414.dload.mall_backend.service.IBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author dload
 * @since 2022-05-11
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
