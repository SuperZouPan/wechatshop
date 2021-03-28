package com.imooc.sell.repository;

import com.imooc.sell.SellApplication;
import com.imooc.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author zoupan
 * @version 1.0
 * @date 2021-03-28 14:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SellApplication.class)
public class ProductInfoRepositoryTest {
    @Autowired
    private  ProductInfoRepository productInfoRepository;


    @Test
    public  void  saveProductInfo(){
        ProductInfo productInfo=new ProductInfo();
        productInfo.setProductId("1");
        productInfo.setCategoryType(2);
        productInfo.setProductDescription("水果很新鲜啦");
        productInfo.setProductName("苹果");
        productInfo.setProductStock(10);
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductIcon("https://image.baidu.com/search");
        ProductInfo productInfo1 = productInfoRepository.save(productInfo);
        System.out.println(productInfo1);
    }
    @Test
    public  void findByProductStatusTest(){
        List<ProductInfo> productInfoList = productInfoRepository.findByProductStatus(0);
        System.out.println(productInfoList.size());
    }


}