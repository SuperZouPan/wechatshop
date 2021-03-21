package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zoupan
 * @version 1.0
 * @date 2021-03-21 16:10
 * JpaRepository 中两个参数，一个是类，一个是主键的类型
 */
@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>, JpaSpecificationExecutor<ProductCategory> {
List<ProductCategory> findByCategoryTypeIn(List<Integer> integerList);
}
