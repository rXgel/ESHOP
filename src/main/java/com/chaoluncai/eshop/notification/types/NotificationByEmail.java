package com.chaoluncai.eshop.notification.types;

import com.chaoluncai.eshop.notification.NotificationPreference;
import org.springframework.stereotype.Component;

@Component("email")
public class NotificationByEmail implements NotificationPreference
{
    @Override
    public void notifyUser() {
        System.out.println("You got an Email!");
    }
}
