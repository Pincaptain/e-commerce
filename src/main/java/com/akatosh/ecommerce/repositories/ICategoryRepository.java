package com.akatosh.ecommerce.repositories;

import com.akatosh.ecommerce.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {}
