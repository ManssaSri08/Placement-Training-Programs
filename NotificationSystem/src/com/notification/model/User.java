package com.notification.model;
public class User {
    private String name;
    private String email;
    private String phone;
    public User(String name, String email, String phone) {
        if(name == null || email == null || phone == null)
            throw new IllegalArgumentException("Invalid user data");
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public String getEmail() { 
        return email;
    }
    public String getPhone() { 
        return phone; 
    }
    public String getName() { 
        return name; 
    }
}