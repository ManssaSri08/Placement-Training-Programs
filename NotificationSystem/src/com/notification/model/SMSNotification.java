package com.notification.model;
public class SMSNotification extends Notification {
    public SMSNotification(User user, String message, String priority) {
        super(user, message, priority);
    }
    @Override
    public void send() {
        if(user.getPhone() == null)
            throw new RuntimeException("Invalid Phone Number");
        System.out.println("SMS NOTIFICATION");
        System.out.println("SMS sent to " + user.getPhone() + " | Message: " + message + " | Priority: " + priority);
    }
}