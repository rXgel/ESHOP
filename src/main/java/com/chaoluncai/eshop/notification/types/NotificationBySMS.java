package com.chaoluncai.eshop.notification.types;

import com.chaoluncai.eshop.notification.NotificationPreference;
import org.springframework.stereotype.Component;

@Component("sms")
public class NotificationBySMS implements NotificationPreference
{
    @Override
    public void notifyUser() {
        System.out.println("You got a SMS!");
    }
}
