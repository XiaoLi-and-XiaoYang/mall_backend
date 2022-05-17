package com.c414.dload.mall_backend.mapper;

import com.c414.dload.mall_backend.elasticsearch.document.EsProductAttributeValue;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 存储产品参数信息的表 Mapper 接口
 * </p>
 *
 * @author dload
 * @since 2022-05-16
 */
@Mapper
public interface EsProductAttributeValueMapper extends BaseMapper<EsProductAttributeValue> {

}
