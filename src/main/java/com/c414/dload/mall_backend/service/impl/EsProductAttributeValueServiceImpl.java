package com.c414.dload.mall_backend.service.impl;

import com.c414.dload.mall_backend.elasticsearch.document.EsProductAttributeValue;
import com.c414.dload.mall_backend.mapper.EsProductAttributeValueMapper;
import com.c414.dload.mall_backend.service.IEsProductAttributeValueService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 存储产品参数信息的表 服务实现类
 * </p>
 *
 * @author dload
 * @since 2022-05-16
 */
@Service
public class EsProductAttributeValueServiceImpl extends ServiceImpl<EsProductAttributeValueMapper, EsProductAttributeValue> implements IEsProductAttributeValueService {

}
