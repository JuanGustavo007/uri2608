package com.juan.uri2608.dto;

import com.juan.uri2608.entities.Products;

public class ProductDto {

    private Long id;
    private String name;
    private Integer amount;
    private Double price;

    public ProductDto(Long id, String name, Integer amount, Double price) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public ProductDto(Products products) {
        this.id = products.getId();
        this.name = products.getName();
        this.amount = products.getAmount();
        this.price = products.getPrice();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAmount() {
        return amount;
    }

    public Double getPrice() {
        return price;
    }
}
