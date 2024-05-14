package com.inventorymanagement.rest550.model;

public class InventoryManagement {

    private int productId;
    private String productName;
    private String category;
    private int productPrice;
    private int sellingPrice;
    private Quantiy quantity;

    public InventoryManagement() {
    }

    public InventoryManagement(int productId, String productName, String category, int productPrice, int sellingPrice, Quantiy quantity) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.productPrice = productPrice;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Quantiy getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantiy quantity) {
        this.quantity = quantity;
    }
}
