package com.springcoreweatherdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class WeatherConfig
{
    @Bean
    public LocalDate localDate()
    {
        return LocalDate.now();
    }

}
