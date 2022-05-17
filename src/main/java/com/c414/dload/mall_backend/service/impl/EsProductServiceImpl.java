package com.c414.dload.mall_backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.c414.dload.mall_backend.elasticsearch.document.EsProduct;
import com.c414.dload.mall_backend.elasticsearch.repo.EsProductRepository;
import com.c414.dload.mall_backend.mapper.EsProductMapper;
import com.c414.dload.mall_backend.service.IEsProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author dload
 * @since 2022-05-15
 */
@Service
public class EsProductServiceImpl extends ServiceImpl<EsProductMapper, EsProduct> implements IEsProductService {

    @Resource
    private EsProductMapper esProductMapper;

    @Resource
    private EsProductRepository esProductRepository;

    @Override
    public Integer importAll() {

        List<EsProduct> esProductList = esProductMapper.selectList(null);
        Iterable<EsProduct> esProducts = esProductRepository.saveAll(esProductList);
        Iterator<EsProduct> iterator = esProducts.iterator();
        Integer res = 0;
        while (iterator.hasNext()) {
            res++;
            iterator.next();
        }
        return res;
    }

    @Override
    public void delete(Long id) {
        esProductMapper.selectById(id);
    }

    @Override
    public EsProduct create(Long id) {
        EsProduct res = null;
        LambdaQueryWrapper<EsProduct> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(EsProduct::getId, id);
        List<EsProduct> esProductList = esProductMapper.selectList(queryWrapper);
        if (esProductList.size() > 0) {
            EsProduct esProduct = esProductList.get(0);
            res = esProductRepository.save(esProduct);
        }
        return res;
    }

    @Override
    public void delete(List<Long> ids) {

        if (!CollectionUtils.isEmpty(ids)) {
            List<EsProduct> esProductList = new ArrayList<>();
            for (Long id :
                    ids) {
                EsProduct esProduct = new EsProduct();
                esProduct.setId(id);
                esProductList.add(esProduct);
            }
            esProductRepository.deleteAll(esProductList);
        }

    }

    @Override
    public Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        return esProductRepository.findByNameOrSubTitleOrKeywords(keyword, keyword, keyword, pageable);
    }
}
