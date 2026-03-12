package com.oingg.holdings.dto;

import java.math.BigDecimal;

public class HoldingRequest {

    private String stockId;
    private int quantity;
    private BigDecimal price;

    // Getters and setters

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
