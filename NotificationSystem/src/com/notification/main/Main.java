package com.notification.main;
import com.notification.model.*;
import com.notification.service.NotificationService;
public class Main {
    public static void main(String[] args) {
        User user = new User("Manssa", "manssa@gmail.com", "9876543210");
        Notification email = new EmailNotification(user, "Welcome!", "HIGH");
        Notification sms = new SMSNotification(user, "OTP: 1234", "MEDIUM");
        Notification push = new PushNotification(user, "New Offer!", "LOW");
        NotificationService service = new NotificationService();
        service.sendNotification(email);
        service.sendNotification(sms);
        service.sendNotification(push);
    }
}