/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory;
import java.util.*;

public class Offer {
    private int id;
    private Product product;
    private double discountPercent;
    private Date startDate;
    private Date endDate;

public Offer() {
    
}
public Offer(int id,Product product,double discountPercent,
             Date startDate, Date endDate )
{
    this.id=id;
    this.discountPercent=discountPercent;
    this.product=product;
    this.startDate=startDate;
    this.endDate=endDate;
}
public void setId(int id) {
    this.id=id;
}
public void setProduct(Product product) {
    this.product=product;
}

public void setDiscountPercent(double discountPercent) {
    this.discountPercent=discountPercent; 
}
public void setStartDate(Date startDate) {
    this.startDate=startDate; 
}
public void setEndDate(Date endDate) {
    this.endDate=endDate; 
}

 public int getId() {
     return id; 
 }
 public Product getProduct() {
     return product; 
 }
 public double getDiscountPercent() {
     return discountPercent; 
 }
 public Date getStartDate() {
     return startDate; 
 }
 public Date getEndDate() { 
     return endDate; 
 }
 public int getProductId()
{
   return product.getId();
}
}
