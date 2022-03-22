package com.chaoluncai.eshop.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.chaoluncai.eshop.jpa.entity")
@ComponentScan(basePackages = "com.chaoluncai.eshop.notification.types")
@ComponentScan(basePackages = "com.chaoluncai.eshop.exception")
public class UserConfig
{
}
