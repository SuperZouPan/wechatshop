package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.enums.ProductStatusEnums;
import com.imooc.sell.repository.ProductInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author zoupan
 * @version 1.0
 * @date 2021-03-28 15:11
 */
@Service
public class ProductInfoServiceImpl implements   ProductInfoService {

    @Autowired
    private  ProductInfoRepository productInfoRepository;
    @Override
    public ProductInfo findOne(String productId) {
        Optional<ProductInfo> optionalProductInfo = productInfoRepository.findById(productId);
        if(optionalProductInfo.isPresent()){
            return  optionalProductInfo.get();
        }
        return null;
    }

    @Override
    public List<ProductInfo> findUpAll() {
        List<ProductInfo> productInfoList = productInfoRepository.findByProductStatus(ProductStatusEnums.UP.getCode());
        return productInfoList;
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        Page<ProductInfo> productInfoPage = productInfoRepository.findAll(pageable);
        return productInfoPage;
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        ProductInfo productInfo1 = productInfoRepository.save(productInfo);
        return productInfo1;
    }
}
