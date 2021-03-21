package com.imooc.sell.repository;

import com.imooc.sell.SellApplication;
import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author zoupan
 * @version 1.0
 * @date 2021-03-21 16:12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SellApplication.class)
public  class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void getOne(){
        Optional<ProductCategory> optionalProductCategory=productCategoryRepository.findById(1);
        if(optionalProductCategory.isPresent()){
            ProductCategory productCategory=optionalProductCategory.get();
            System.out.println(productCategory);
        }
    }

//    @Test
//    @Transactional
//    public  void saveTest(){
//        ProductCategory productCategory=new ProductCategory();
//        productCategory.setCategoryName("海鲜类");
//        productCategory.setCategoryType(4);
//        productCategoryRepository.save(productCategory);
//    }

    @Test
    public  void findByCategoryTypeIn(){
        List<Integer> categorytypes= Arrays.asList(1,2,3,4);
        List<ProductCategory>  productCategoryList=productCategoryRepository.findByCategoryTypeIn(categorytypes);
        if(productCategoryList!=null&&productCategoryList.size()!=0){
            System.out.println(productCategoryList.size());
        }
    }

}