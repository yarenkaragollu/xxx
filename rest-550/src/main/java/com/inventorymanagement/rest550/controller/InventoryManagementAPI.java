package com.inventorymanagement.rest550.controller;

import com.inventorymanagement.rest550.model.InventoryManagement;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryManagementAPI {
    InventoryManagement inventoryManagement;
    @GetMapping("{productId}")
    public InventoryManagement getProductDetails(String productId) {
        return inventoryManagement;
                //(1,"ASUS","NOTEBOOK",1200,2000,Quantiy.HIGH);
    }

    @PostMapping
    public String createProduct(@RequestBody InventoryManagement inventoryManagement)
    {
        this.inventoryManagement = inventoryManagement;
        return "Product created successfully.";
    }

    @PutMapping
    public String updateProductDetails(@RequestBody InventoryManagement inventoryManagement)
    {
        this.inventoryManagement = inventoryManagement;
        return "Product updated successfully.";
    }
    @DeleteMapping("{productId}")
    public String deleteProduct(String productId) {
        this.inventoryManagement = null;
        return "Product deleted successfully.";}
}
