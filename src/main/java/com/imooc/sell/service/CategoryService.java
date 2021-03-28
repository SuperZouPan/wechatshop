package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zoupan
 * @version 1.0
 * @date 2021-03-21 21:05
 */
@Service
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> integerList);
    ProductCategory save(ProductCategory productCategory);
}
