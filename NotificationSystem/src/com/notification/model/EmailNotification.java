package com.notification.model;
public class EmailNotification extends Notification {
    public EmailNotification(User user, String message, String priority) {
        super(user, message, priority);
    }
    @Override
    public void send() {
        if(user.getEmail() == null)
            throw new RuntimeException("Invalid Email");
        System.out.println("EMAIL NOTIFICATION");
        System.out.println("Email sent to " + user.getEmail() + " | Message: " + message + " | Priority: " + priority);
    }
}