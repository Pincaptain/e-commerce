package com.akatosh.ecommerce.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Accessory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "accessories", cascade = CascadeType.ALL)
    private Set<Product> products;

    public Accessory(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

}
