package com.notification.model;
public abstract class Notification {
    protected String message;
    protected User user;
    protected String priority;
    public Notification(User user, String message, String priority) {
        if(message == null || message.isEmpty())
            throw new IllegalArgumentException("Message cannot be empty");
        this.user = user;
        this.message = message;
        this.priority = priority;
    }
    public abstract void send();
}