package com.chaoluncai.eshop.notification.types;

import com.chaoluncai.eshop.notification.NotificationPreference;
import org.springframework.stereotype.Component;

@Component("alien")
public class NotificationByAlien implements NotificationPreference
{
    @Override
    public void notifyUser() {
        System.out.println("Alien: here is the update");
    }
}
