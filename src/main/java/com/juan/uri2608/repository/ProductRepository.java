package com.juan.uri2608.repository;

import com.juan.uri2608.dto.ProductDto;
import com.juan.uri2608.dto.ProductMinDto;
import com.juan.uri2608.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Products, Long> {

    @Query("SELECT new com.juan.uri2608.dto.ProductMinDto(MAX(p.price), MIN(p.price)) FROM Products p")
    ProductMinDto searchByMaxAndMin();
}
