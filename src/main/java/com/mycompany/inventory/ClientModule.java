package com.mycompany.inventory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

public class ClientModule {

    private final ArrayList<Client> clients = new ArrayList<>();
    private final ArrayList<Order> orders = new ArrayList<>();
    private final PRODUCTMODULE productModule;
    private int nextOrderId = 1;

    public ClientModule(PRODUCTMODULE productModule) {
        this.productModule = productModule;
    }

    // Register new client
    public boolean register(Client client) {
        for (Client c : clients) {
            if (c.getId() == client.getId()) {
                System.out.println("Client already exists!");
                return false;
            }
        }
        clients.add(client);
        System.out.println("Client registered: " + client.getName());
        return true;
    }

    // Edit client data
    public boolean editClient(int id, String name, String email, String phone) {
        for (Client c : clients) {
            if (c.getId() == id) {

                if (name != null && !name.isEmpty())  c.setName(name);
                if (email != null && !email.isEmpty()) c.setEmail(email);
                if (phone != null && !phone.isEmpty()) c.setPhone(phone);

                System.out.println("Client updated successfully.");
                return true;
            }
        }

        System.out.println("Client not found.");
        return false;
    }

    // Request purchase order
    public boolean requestPurchaseOrder(int clientId, Map<Integer, Integer> items) {

        // Find client
        Client client = null;
        for (Client c : clients) {
            if (c.getId() == clientId) {
                client = c;
                break;
            }
        }
        if (client == null) {
            System.out.println("Client not found!");
            return false;
        }

        // Create new order
        String today = LocalDate.now().toString();
        Order order = new Order(nextOrderId++, client, today);

        // Validate and add items
        for (Map.Entry<Integer, Integer> entry : items.entrySet()) {

            int productId = entry.getKey();
            int quantity   = entry.getValue();

            // Find product by id
            Product product = findProductById(productId);
            if (product == null) {
                System.out.println("Product not found: " + productId);
                return false;
            }

            // Check quantity
            if (product.getQuantity() < quantity) {
                System.out.println("Not enough quantity for product: " + product.getName());
                return false;
            }

            // Deduct quantity
            product.setQuantity(product.getQuantity() - quantity);

            // Create order item
            OrderItem item = new OrderItem(product, quantity);
            order.addItem(item);
        }

        orders.add(order);
        printInvoice(order);

        System.out.println("Email sent to: " + client.getEmail());
        return true;
    }

    // Helper: find product from PRODUCTMODULE
    private Product findProductById(int id) {
        for (Product p : productModule.getAllProducts()) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    // Print invoice
    private void printInvoice(Order order) {
        System.out.println("------ INVOICE ------");
        System.out.println("Order ID: " + order.getId());
        System.out.println("Client: " + order.getClient().getName());
        System.out.println("Date: " + order.getDate());
        System.out.println("---------------------");

        double total = 0;

        for (OrderItem item : order.getItems()) {
            Product p = item.getProduct();
            double line = p.getSellingPrice() * item.getQuantity();

            System.out.println(
                p.getName() + " x " + item.getQuantity() +
                " = " + line + " EGP"
            );

            total += line;
        }

        System.out.println("---------------------");
        System.out.println("Total: " + total + " EGP");
        System.out.println("---------------------");
    }

    // Show orders for a specific client
    public void showOrders(int clientId) {
        for (Order o : orders) {
            if (o.getClient().getId() == clientId) {
                System.out.println("Order ID: " + o.getId() + " on " + o.getDate());
            }
        }
    }
}
