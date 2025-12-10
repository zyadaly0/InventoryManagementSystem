/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory;


public class OrderItem {
    private Product product;
    private int quantity ;
public OrderItem()
{
    
}
public OrderItem(Product product, int quantity)
{
    this.quantity=quantity;
    this.product=product;
}
public int getQuantity() {
    return quantity;
}
public Product getProduct() {
    return product;
}


public void setQuantity(int quantity) {
    this.quantity=quantity;
}
public void setProduct(Product product) {
    this.product=product;
}

}
