package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;
import com.imooc.sell.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author zoupan
 * @version 1.0
 * @date 2021-03-22 21:46
 */
@Service
public class CategoryServiceImpl implements   CategoryService {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;
    @Override
    public ProductCategory findOne(Integer categoryId) {
        Optional<ProductCategory> optionalProductCategory = productCategoryRepository.findById(categoryId);
        if(optionalProductCategory.isPresent()){
            return  optionalProductCategory.get();
        }
        return new ProductCategory();
    }

    @Override
    public List<ProductCategory> findAll() {
        List<ProductCategory> productCategoryRepositoryAll = productCategoryRepository.findAll();
        return productCategoryRepositoryAll;
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> integerList) {
        List<ProductCategory> categoryTypeIn = productCategoryRepository.findByCategoryTypeIn(integerList);
        return categoryTypeIn;
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        ProductCategory productCategory1 = productCategoryRepository.save(productCategory);
        return productCategory1;
    }
}
