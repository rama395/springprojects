package com.singletonscope.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Configuration
@ComponentScan(basePackages = "com.singletonscope.beans")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig:0-param constructor");
    }

    @Bean(name = "dt")
    @Scope("singleton")
    public LocalDateTime createLDT() {
        System.out.println("AppConfig.createLDT()");
        return LocalDateTime.now();
    }

    @Bean(name = "dt1")
    @Scope("singleton")
    public LocalDateTime createLDT1() {
        System.out.println("AppConfig.createLDT1()");
        return LocalDateTime.now();
    }


}
