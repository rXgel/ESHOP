package com.chaoluncai.eshop.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
@Component
public class NotificationExceptionHandler {

    @ExceptionHandler(value={NotificationRequestException.class})
    public String handleNotificationRequestException(NotificationRequestException e)
    {
        //1. Create payload containing exception details
        NotificationException notifException = new NotificationException(
                e.getMessage(),
                ZonedDateTime.now()
        );
        return notifException.toString();
    }

}
