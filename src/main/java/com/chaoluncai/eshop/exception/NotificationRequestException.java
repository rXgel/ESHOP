package com.chaoluncai.eshop.exception;

public class NotificationRequestException extends RuntimeException
{
    public NotificationRequestException(String message) {
        super(message);
    }

    public NotificationRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
