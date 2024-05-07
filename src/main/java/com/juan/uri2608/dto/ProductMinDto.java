package com.juan.uri2608.dto;

import com.juan.uri2608.entities.Products;

public class ProductMinDto {

    private Double price;
    private Double price2;

    public ProductMinDto(Double price, Double price2) {
        this.price = price;
        this.price2 = price2;
    }

    public ProductMinDto(Products products) {
        this.price = products.getPrice();
        this.price2 = products.getPrice();
    }

    public Double getPrice() {
        return price;
    }

    public Double getPrice2() {
        return price2;
    }
}
