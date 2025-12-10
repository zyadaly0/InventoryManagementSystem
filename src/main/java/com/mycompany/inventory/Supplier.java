/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory;


public class Supplier {
private int id;
private String name;
private String phone;
private String email;
 
public Supplier()
{
    
}
public Supplier(int id ,String name ,String phone,String email  )
{
    this.name=name ;
    this. id= id;
    this.email=email;
    this.phone=phone;
}
    public int getId() { 
        return id; 
    }
    public String getName() {
        return name; 
    }
    public String getPhone() {
        return phone; 
    }
    public String getEmail() {
        return email; 
    }

    public void setId(int id) {
        this.id = id; 
    }
    public void setName(String name) {
        this.name = name; 
    }
    public void setPhone(String phone) {
        this.phone = phone; 
    }
    public void setEmail(String email) {
        this.email = email; 
    }

}
