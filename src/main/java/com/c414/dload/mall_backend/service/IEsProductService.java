package com.c414.dload.mall_backend.service;

import com.c414.dload.mall_backend.elasticsearch.document.EsProduct;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author dload
 * @since 2022-05-15
 */
public interface IEsProductService extends IService<EsProduct> {

    Integer importAll();

    void delete(Long id);

    EsProduct create(Long id);

    void delete(List<Long> ids);

    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);

}
