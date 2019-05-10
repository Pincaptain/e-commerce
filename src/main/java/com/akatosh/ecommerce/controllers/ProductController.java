package com.akatosh.ecommerce.controllers;

import com.akatosh.ecommerce.models.Product;
import com.akatosh.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping(produces = "application/json")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Product getProduct(@PathVariable int id) {
        return service.getProduct(id);
    }

    @GetMapping(value = "/category/{id}", produces = "application/json")
    public List<Product> getProductsByCategory(@PathVariable int id) {
        return service.getProductsByCategory(id);
    }

    @GetMapping(value = "/category/{categoryId}/manufacturer/{manufacturerId}", produces = "application/json")
    public List<Product> getProductsByCategoryAndManufacturer(@PathVariable int categoryId,
                                                              @PathVariable int manufacturerId) {
        return service.getProductsByCategoryAndManufacturer(categoryId, manufacturerId);
    }

    @GetMapping(value = "/category/{id}/price")
    public float getProductsPriceByCategory(@PathVariable int id) {
        return service.getProductsPriceByCategory(id);
    }

}
