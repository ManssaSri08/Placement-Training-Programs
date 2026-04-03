package com.notification.model;
public class PushNotification extends Notification {
    public PushNotification(User user, String message, String priority) {
        super(user, message, priority);
    }
    @Override
    public void send() {
        System.out.println("PUSH NOTIFICATION");
        System.out.println("Push notification to " + user.getName() + " | Message: " + message + " | Priority: " + priority);
    }
}