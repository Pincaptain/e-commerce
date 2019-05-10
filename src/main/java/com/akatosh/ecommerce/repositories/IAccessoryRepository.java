package com.akatosh.ecommerce.repositories;

import com.akatosh.ecommerce.models.Accessory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccessoryRepository extends JpaRepository<Accessory, Integer> {}
