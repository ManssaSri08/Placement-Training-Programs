package com.ecommerce.main;
import com.ecommerce.model.*;
import com.ecommerce.service.OrderService;
public class Main {
    public static void main(String[] args){
        User u=new User("Test_user","Dubai");
        Product p=new Product("Keyboard",800);
        Order o=new Order(u,p,4);
        OrderService service=new OrderService();
        service.placeOrder(o);
    }
}