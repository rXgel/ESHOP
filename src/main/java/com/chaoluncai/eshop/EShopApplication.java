package com.chaoluncai.eshop;

import com.chaoluncai.eshop.configs.UserConfig;
import com.chaoluncai.eshop.jpa.entity.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class EShopApplication {

    public static void main(String[] args) {
        ApplicationContext userFactory = new AnnotationConfigApplicationContext(UserConfig.class);
        User user = userFactory.getBean(User.class);
        user.getNotification();
//        SpringApplication.run(EShopApplication.class, args);
    }
}
