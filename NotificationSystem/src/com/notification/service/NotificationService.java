package com.notification.service;
import com.notification.model.Notification;
public class NotificationService {
    public void sendNotification(Notification n) {
        try {
            n.send();
        } catch(Exception e) {
            System.out.println("Failed to send notification: " + e.getMessage());
        }
    }
}