/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory;
import java.util.*;

public class AdminModule {
    
    private ArrayList<Category> categories = new ArrayList<>();
    private ArrayList<Supplier> suppliers = new ArrayList<>();
    private ArrayList<Offer> offers = new ArrayList<>();
    private ArrayList<Product> products;
    
// constructor     
    public AdminModule(ArrayList<Product> products) {
        this.products = products;
    }
// category operations
   public void addCategory(Category c)
   {
       categories.add(c);
       System.out.println("category added ");
   }
   public void updateCategory(int id , String updatedName,String updatedDesc)
   {
    for (int i = 0; i < categories.size(); i++) {
        if (categories.get(i).getId() == id) 
           { categories.get(i).setName(updatedName);
              categories.get(i).setDescription(updatedDesc);
              System.out.println("Category updated ");
           }
           
       }  
       System.out.println("Category not found ");    
    }


public void deleteCategory(int id )
{
 for (int i = 0; i < categories.size(); i++) {
        if (categories.get(i).getId() == id) {
            categories.remove(i);
            System.out.println("category deleted");
            break;
        }
   }
}
// supplier operation 
public void addSupplier(Supplier s)
{
    suppliers.add(s);
     System.out.println("supplier added ");
}
public void updateSupplier(int id , String updatedName, String updatedEmail, String updatedPhone )
{
     for (int i = 0; i < suppliers.size(); i++) {
        if (suppliers.get(i).getId() == id) 
        {
            suppliers.get(i).setName(updatedName);
            suppliers.get(i).setEmail(updatedEmail);
            suppliers.get(i).setPhone(updatedPhone);
            System.out.println("supplier updated");
        }  
            
       }
     System.out.println("supplier not found ");     
}
public void deleteSupplier(int id )
{
 for (int i = 0; i < suppliers.size(); i++) {
        if (suppliers.get(i).getId() == id) {
            suppliers.remove(i);
            System.out.println("Supplier deleted");
            break;
        }
   }
}

// offer operation
 public void addOffer(Offer offer)
 {
     offers.add(offer);
     System.out.println("Offer added for product ID: " + offer.getProductId());

 }
 public Offer getOfferForProduct(int productId) {
Date today = new Date();
for (int i = 0; i < offers.size(); i++) {
        if (offers.get(i).getProductId() == productId) 
        {
        if (!today.before(offers.get(i).getStartDate()) && !today.after(offers.get(i).getEndDate())) {
                return offers.get(i);
         }
        
       }
     }
  return null;
  }
 //reports 
 public void reportProducts(String categoryName) {
    System.out.println("Products Report:");
    
    for (Product p : products) {
        if (categoryName == null || categoryName.isEmpty() || 
            p.getCategory().getName().equalsIgnoreCase(categoryName)) {
            System.out.println( p.getName() + " Category: " + p.getCategory() + 
                               "  Quantity: " + p.getQuantity());
        }
    }
    
}

  
}