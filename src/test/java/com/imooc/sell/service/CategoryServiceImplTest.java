package com.imooc.sell.service;

import com.imooc.sell.SellApplication;
import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author zoupan
 * @version 1.0
 * @date 2021-03-28 9:13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SellApplication.class)
public class CategoryServiceImplTest {

    @Autowired
    private  CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        ProductCategory productCategory = categoryService.findOne(1);
        System.out.println(productCategory);
    }

    @Test
    public void findAll() {
        List<ProductCategory> categoryServiceAll = categoryService.findAll();
        System.out.println(categoryServiceAll.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> productCategories = categoryService.findByCategoryTypeIn(Arrays.asList(1, 2, 3, 4));
        System.out.println(productCategories.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("肉质品", 10);
        categoryService.save(productCategory);
        System.out.println(productCategory);
    }
}