package com.juan.uri2608.services;

import com.juan.uri2608.dto.ProductDto;
import com.juan.uri2608.dto.ProductMinDto;
import com.juan.uri2608.entities.Products;
import com.juan.uri2608.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public ProductDto findById(Long id) {
        Products products = productRepository.findById(id).orElseThrow(() -> new RuntimeException());
        return new ProductDto(products);
    }


    @Transactional(readOnly = true)
    public ProductMinDto findByMaxAndMin(){
        ProductMinDto productMinDto = productRepository.searchByMaxAndMin();
        return productMinDto;
    }
}
