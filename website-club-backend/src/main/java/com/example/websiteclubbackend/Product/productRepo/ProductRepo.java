package com.example.websiteclubbackend.Product.productRepo;

import com.example.websiteclubbackend.Product.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
    Product findByTitle(String title);
}
