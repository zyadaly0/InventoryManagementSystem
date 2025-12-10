/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class PRODUCTMODULE {
     
    private final ArrayList<Product> products;
    private int nextId;
    
    public PRODUCTMODULE() {
        products = new ArrayList<>();
        nextId = 1;
    }
    
    // Add product
    public Product addProduct(String name, Category category, Supplier supplier,
                             String productionDate, String expirationDate,
                             int quantity, double price, double cost) {
        
        Product product = new Product(nextId, name, category, supplier,
                                     productionDate, expirationDate, quantity, price , cost);
        products.add(product);
        nextId++;
        return product;
    }
    
    // Update product
    public boolean updateProduct(int id, String name, Category category, Supplier supplier,
                                String productionDate, String expirationDate,
                                int quantity, double price) {
        
        for (Product p : products) {
            if (p.getId() == id) {
                if (name != null) p.setName(name);
                if (category != null) p.setCategory(category);
                if (supplier != null) p.setSupplier(supplier);
                if (productionDate != null) p.setProductionDate(productionDate);
                if (expirationDate != null) p.setExpirationDate(expirationDate);
                if (quantity >= 0) p.setQuantity(quantity);
                if (price >= 0) p.setSellingPrice(price);
                return true;
            }
        }
        return false;
    }
    
    // Delete product
    public boolean deleteProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                return true;
            }
        }
        return false;
    }
    
    // Search by name
    public ArrayList<Product> searchByName(String name) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }
    
    // Search by category
    public ArrayList<Product> searchByCategory(int categoryId) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getCategory().getId() == categoryId) {
                result.add(p);
            }
        }
        return result;
    }
    
    // Search by production date
    public ArrayList<Product> searchByProductionDate(String date) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getProductionDate().equals(date)) {
                result.add(p);
            }
        }
        return result;
    }
    
    // Search by expiration date
    public ArrayList<Product> searchByExpirationDate(String date) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getExpirationDate().equals(date)) {
                result.add(p);
            }
        }
        return result;
    }
    
    // Notify for near expiration and low quantity
    public void checkExpirationAndQuantity() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        for (Product p : products) {
            try {
                LocalDate expDate = LocalDate.parse(p.getExpirationDate(), formatter);
                long daysLeft = java.time.temporal.ChronoUnit.DAYS.between(today, expDate);
                
                if (daysLeft <= 30 && daysLeft >= 0) {
                    System.out.println("Product " + p.getName() + " will expire in " + daysLeft + " days");
                }
                if (daysLeft < 0) {
                    System.out.println("Product " + p.getName() + " is expired");
                }
            } catch (Exception e) {
            }
            
            if (p.getQuantity() <= 10) {
                System.out.println("Product " + p.getName() + " has low quantity: " + p.getQuantity());
            }
        }
    }
    
    public ArrayList<Product> getAllProducts() {
        return products;
    }
}
