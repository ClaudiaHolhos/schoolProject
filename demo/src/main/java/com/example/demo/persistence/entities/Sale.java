package com.example.demo.persistence.entities;

import javax.persistence.*;

@Entity
@Table
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private int customerId;

    @Column(name = "productId")
    private int productId;

    @Column(name = "quantity")
    private int quantity;

    public Sale(){

    }

    public Sale( int productId, int quantity,int sum){
        this.productId = productId;
        this.customerId = customerId;
        this.quantity = quantity;
        this.sum = sum;
    }

    public Sale(Sale sale){
        this.id = sale.getId();
        this.productId = sale.getProductId();
        this.customerId = sale.getCustomerId();
        this.quantity = sale.getQuantity();
        this.sum = sale.getSum();
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", sum=" + sum +
                '}';
    }

    @Column(name = "sum")
    private int sum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
