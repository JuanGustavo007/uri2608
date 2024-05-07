package com.juan.uri2608.controller;

import com.juan.uri2608.dto.ProductDto;
import com.juan.uri2608.dto.ProductMinDto;
import com.juan.uri2608.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id) {
         ProductDto productDto = productService.findById(id);
         return ResponseEntity.ok(productDto);
    }

    @GetMapping(value = "/maxmin")
    public ResponseEntity<ProductMinDto> getMaxMin() {
        ProductMinDto productMinDto = productService.findByMaxAndMin();
        return ResponseEntity.ok(productMinDto);
    }
}
