package com.imooc.sell.service;

import com.imooc.sell.SellApplication;
import com.imooc.sell.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author zoupan
 * @version 1.0
 * @date 2021-03-28 16:42
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SellApplication.class)
public class ProductInfoServiceImplTest {

    @Autowired
    private  ProductInfoServiceImpl productInfoService;
    @Test
    public void findOne() {
        ProductInfo productInfoServiceOne = productInfoService.findOne("1");
        System.out.println(productInfoServiceOne);
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoServiceUpAll = productInfoService.findUpAll();
        System.out.println(productInfoServiceUpAll.size());
    }

    @Test
    public void findAll() {
        PageRequest request=new PageRequest(0,10);
        Page<ProductInfo> productInfoPage = productInfoService.findAll(request);
        System.out.println( productInfoPage.getTotalElements());


    }

    @Test
    public void save() {
        ProductInfo productInfo=new ProductInfo();
        productInfo.setProductId("2");
        productInfo.setCategoryType(3);
        productInfo.setProductDescription("海鲜很棒");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductStock(100);
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductIcon("https://image.baidu.com/search");
        ProductInfo productInfo1 = productInfoService.save(productInfo);
    }
}