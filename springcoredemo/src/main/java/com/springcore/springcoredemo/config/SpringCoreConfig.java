package com.springcore.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class SpringCoreConfig
{
    @Bean
    public LocalTime localTime()
    {
        return LocalTime.now();
    }


}
