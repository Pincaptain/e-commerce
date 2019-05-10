package com.akatosh.ecommerce.repositories;

import com.akatosh.ecommerce.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Integer> {}
