package com.imooc.sell.enums;

import lombok.Data;

/**
 * 商品状态
 * @author zoupan
 * @version 1.0
 * @date 2021-03-28 15:22
 */
public enum ProductStatusEnums {
    UP(0,"上架"),
    DOWN(1,"下架")

    ;
    private  Integer code;
    private  String message;

    ProductStatusEnums(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }}
