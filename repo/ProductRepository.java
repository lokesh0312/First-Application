package com.example.first.firstapplication.repo;

import com.example.first.firstapplication.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
