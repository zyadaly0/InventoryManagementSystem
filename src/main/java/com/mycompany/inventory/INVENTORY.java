/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventory;
import java.util.ArrayList;
public class INVENTORY {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
class Product{
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
 
 public int getId() { return id; }
    public String getName() { return name; }
    public Category getCategory() { return category; }
    public Supplier getSupplier() { return supplier; }
    public String getProductionDate() { return productionDate; }
    public String getExpirationDate() { return expirationDate; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCategory(Category category) { this.category = category; }
    public void setSupplier(Supplier supplier) { this.supplier = supplier; }
    public void setProductionDate(String productionDate) { this.productionDate = productionDate; }
    public void setExpirationDate(String expirationDate) { this.expirationDate = expirationDate; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setPrice(double price) { this.price = price; }
}
class Category
{
    private int id;
    private String name;
    private String description; 
    
    public Category(){
        
    }
    public Category(int id, String name,String description)
    {
        this.id=id;
        this.name=name;
        this.description=description;
    }
  public void setId(int id) {this.id=id;}
  public void setDescription(String description) {this.description=description;}
  public void setName(String name) {this.name=name;}
  
  public String getName()    {return name;}
  public int    getId()      { return id; }
  public String getDescription() {return description;}         
            
         }
class Supplier{
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
    public int getId() { return id; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email; }

}
class Client {
    private int id;
    private String name;
    private String phone;
    private String email;

public Client()
{
    
}
public Client(int id, String name, String phone, String email)
{
    this.id=id;
    this.email=email;
    this.name=name;
    this.phone=phone;
}
    public int getId() { return id; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email; }

}
class Offer
{
    private int id;
    private Product product;
    private double discountPercent;
    private String startDate;
    private String endDate;

public Offer() {
    
}
public Offer(int id,Product product,double discountPercent,
             String startDate, String endDate )
{
    this.id=id;
    this.discountPercent=discountPercent;
    this.product=product;
    this.startDate=startDate;
    this.endDate=endDate;
}
public void setId(int id) {this.id=id;}
public void setProduct(Product product) { this.product=product;}
public void setDiscountPercent(double discountPercent) { this.discountPercent=discountPercent; }
public void setStartDate(String startDate) { this.startDate=startDate; }
public void setEndDate(String endDate) { this.endDate=endDate; }

 public int getId() { return id; }
 public Product getProduct() { return product; }
 public double getDiscountPercent() { return discountPercent; }
 public String getStartDate() { return startDate; }
 public String getEndDate() { return endDate; }
}
class OrderItem
{
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
public int getQuantity() {return quantity;}
public Product getProduct() {return product;}

public void setQuantity(int quantity) {this.quantity=quantity;}
public void setProduct(Product product) {this.product=product;}
}


 class Order {

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

    public int getId() { return id; }
    public Client getClient() { return client; }
    public ArrayList<OrderItem> getItems() { return items; }
    public String getDate() { return date; }

    public void setId(int id) { this.id = id; }
    public void setClient(Client client) { this.client = client; }
    public void setDate(String date) { this.date = date; }
}
