/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory;


public class Product {
    
    private int id;
    private String name ;
    private double price;
    private Category category;
    private int quantity;
    private String productionDate;
    private String expirationDate;
    private Supplier supplier ; 
public Product()
 {
            
 } 
 public Product(int id, String name, Category category, Supplier supplier,
                   String productionDate, String expirationDate,
                   int quantity, double price) {

        this.id = id;
        this.name = name;
        this.category = category;
        this.supplier = supplier;
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
        this.quantity = quantity;
        this.price = price;
    }
 
 public int getId() { 
     return id; 
 }
    public String getName() { 
        return name; 
    }
    public Category getCategory() { 
        return category; 
    }
    public Supplier getSupplier() { 
        return supplier; 
    }
    public String getProductionDate() { 
        return productionDate; 
    }
    public String getExpirationDate() { 
        return expirationDate; 
    }
    public int getQuantity() { 
        return quantity; 
    }
    public double getPrice() {
        return price; 
    }

    public void setId(int id) { 
        this.id = id; 
    }
    public void setName(String name) { 
        this.name = name; 
    }
    public void setCategory(Category category) {
        this.category = category; 
    }
    public void setSupplier(Supplier supplier) { 
        this.supplier = supplier; 
    }
    public void setProductionDate(String productionDate) { 
        this.productionDate = productionDate; 
    }
    public void setExpirationDate(String expirationDate) { 
        this.expirationDate = expirationDate; 
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity; 
    }
    public void setPrice(double price) { 
        this.price = price; 
    }

}
