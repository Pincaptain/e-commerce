package com.akatosh.ecommerce.services;

import com.akatosh.ecommerce.models.Product;
import com.akatosh.ecommerce.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final IProductRepository repository;

    @Autowired
    public ProductService(IProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProduct(int id) {
        return repository.getOne(id);
    }

    public List<Product> getProductsByCategory(int id) {
        return repository
                .findAll()
                .stream()
                .filter(p -> p.getCategory().getId() == id).collect(Collectors.toList());
    }

    public List<Product> getProductsByCategoryAndManufacturer(int categoryId, int manufacturerId) {
        return repository
                .findAll()
                .stream()
                .filter(p -> p.getCategory().getId() == categoryId)
                .filter(p -> p.getManufacturer().getId() == manufacturerId)
                .collect(Collectors.toList());
    }

    public float getProductsPriceByCategory(int id) {
        return (float) repository
                .findAll()
                .stream()
                .filter(p -> p.getCategory().getId() == id)
                .mapToDouble(Product::getPrice).sum();
    }

}
