/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory;

import java.util.*;


public class Order {
     private int id;
    private Client client;
    private ArrayList<OrderItem> items;
    private String date;

    public Order(int id, Client client, String date) {
        this.id = id;
        this.client = client;
        this.date = date;
        this.items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public int getId() { 
        return id; 
    }
    public Client getClient() { 
        return client; 
    }
    public ArrayList<OrderItem> getItems() { 
        return items; 
    }
    public String getDate() {
        return date; 
    }

    public void setId(int id) { 
        this.id = id; 
    }
    public void setClient(Client client) {
        this.client = client; 
    }
    public void setDate(String date) { 
        this.date = date;
    }
}
