package com.example.ecom;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private double price;
    private String category;
    private ArrayList colors;
    private int discountAmount;

    public Product(){};

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public ArrayList getColors() {
        return colors;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public Product(long id, String name, String description, double price, String category, ArrayList colors, int discountAmount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.colors = colors;
        this.discountAmount = discountAmount;
    }
}
