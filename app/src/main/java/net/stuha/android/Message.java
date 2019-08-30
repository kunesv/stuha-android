package net.stuha.android;

import java.time.LocalDateTime;
import java.util.Date;

public class Message {
    private String message;
    private User sender;
    private Date createdAt;

    public Message() {
    }

    public Message(String message, User sender, Date createdAt) {
        this.message = message;
        this.sender = sender;
        this.createdAt = createdAt;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
