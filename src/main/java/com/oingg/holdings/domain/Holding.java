package com.oingg.holdings.domain;

import java.math.BigDecimal;

public class Holding {

    private String id;
    private String stockId;
    private int quantity;
    private BigDecimal price;

    public Holding(String stockId, int quantity, BigDecimal price) {
        this.stockId = stockId;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
