package com.akatosh.ecommerce.repositories;

import com.akatosh.ecommerce.models.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IManufacturerRepository extends JpaRepository<Manufacturer, Integer> {}
