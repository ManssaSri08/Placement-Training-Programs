package com.ecommerce.service;
import com.ecommerce.model.Order;
public class OrderService {
    public void placeOrder(Order order){
        System.out.println("User Name: "+order.user.name);
        System.out.println("Product Name: "+order.product.name);
        System.out.println("Quantity: "+order.quantity);
        double totalPrice=order.product.price*order.quantity;
        System.out.println("Total price: "+totalPrice);
    }
}