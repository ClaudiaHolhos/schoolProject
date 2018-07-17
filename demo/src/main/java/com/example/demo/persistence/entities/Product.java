package com.example.demo.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "stock")
    private int stock;

    @Column(name = "category")
    private String category;

    @Column(name = "subcategory")
    private String subcategory;

    @Column(name = "price")
    private int price;

    @Column(name = "picture")
    private String picture;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Product() {
    }

    public Product(String name, int stock, String category, String subcategory, int price, String picture) {
        this.name = name;
        this.stock = stock;
        this.category = category;
        this.subcategory = subcategory;
        this.price = price;
        this.picture = picture;
    }

    public Product(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.stock = product.getStock();
        this.category = product.getCategory();
        this.price = product.getPrice();
        this.subcategory = product.getSubcategory();
        this.picture = product.getPicture();


    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                ", category='" + category + '\'' +
                ", subcategory='" + subcategory + '\'' +
                ", price=" + price + '\'' +
                ", picture=" +picture +
                '}';
    }

//    public void setPrice(double aDouble) {
//        this.price = (int) aDouble;
//    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public void setStock(double aDouble) {
//        this.stock = (int) aDouble;
//    }

}
