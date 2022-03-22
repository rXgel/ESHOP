package com.chaoluncai.eshop.jpa.entity;

import com.chaoluncai.eshop.exception.NotificationExceptionHandler;
import com.chaoluncai.eshop.exception.NotificationRequestException;
import com.chaoluncai.eshop.notification.NotificationPreference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User
{
    //instead of hardcoding, change it to get preference type
    // from userDB, which the input comes from user.
    @Autowired
    @Qualifier("alien")
    NotificationPreference NotificationType;

    @Autowired
    NotificationExceptionHandler customExceptionHandler;

    public NotificationPreference getNotificationType()
    {
            if (NotificationType == null) {
                throw new NotificationRequestException(
                        "The Notification Preference is Null!");
            }
        return NotificationType;
    }

    public void setNotificationType(NotificationPreference notificationType) {
        NotificationType = notificationType;
    }

    public void getNotification(){
        try {
            getNotificationType().notifyUser();
        }catch(NotificationRequestException e){
            String errorMsg = customExceptionHandler.handleNotificationRequestException(e);
            System.out.println(errorMsg);
        }
    }
}
