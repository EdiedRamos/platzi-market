package com.platzi.market.domain;

public class DomainProduct {
    private int productId;
    private String name;
    private double price;
    private int stockQuantity;
    private boolean active;
    private DomainCategory category;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public DomainCategory getCategory() {
        return category;
    }

    public void setCategory(DomainCategory category) {
        this.category = category;
    }
}
