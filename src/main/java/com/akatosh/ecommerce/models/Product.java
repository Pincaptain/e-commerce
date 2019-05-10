package com.akatosh.ecommerce.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private float price;

    @ManyToOne
    @JoinColumn
    private Category category;

    @ManyToOne
    @JoinColumn
    private Manufacturer manufacturer;

    @ManyToMany
    @JoinColumn
    private Set<Accessory> accessories;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Set<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(Set<Accessory> accessories) {
        this.accessories = accessories;
    }

}
