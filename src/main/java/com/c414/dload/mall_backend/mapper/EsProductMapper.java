package com.c414.dload.mall_backend.mapper;

import com.c414.dload.mall_backend.elasticsearch.document.EsProduct;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 商品信息 Mapper 接口
 * </p>
 *
 * @author dload
 * @since 2022-05-15
 */
@Mapper
public interface EsProductMapper extends BaseMapper<EsProduct> {

}
