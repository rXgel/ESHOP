package com.chaoluncai.eshop.exception;

import java.time.ZonedDateTime;

public class NotificationException
{
    private final String message;
    private final ZonedDateTime timestamp;

    public NotificationException(String message,
                                 ZonedDateTime timestamp)
    {
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "NotificationException{" +
                "message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
