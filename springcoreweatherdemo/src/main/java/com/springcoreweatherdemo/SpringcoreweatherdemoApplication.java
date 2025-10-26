package com.springcoreweatherdemo;

import com.springcoreweatherdemo.beans.WishMessageGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcoreweatherdemoApplication implements CommandLineRunner {
    @Autowired
    private WishMessageGenerator wishMessageGenerator;

    public static void main(String[] args) {
        SpringApplication.run(SpringcoreweatherdemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Welcome");
        String s = wishMessageGenerator.generateWishMessage("Rama");
        System.out.println(s);


    }
}
