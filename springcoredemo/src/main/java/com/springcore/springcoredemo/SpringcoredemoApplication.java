package com.springcore.springcoredemo;

import com.springcore.springcoredemo.springbeans.WishMessageGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcoredemoApplication implements CommandLineRunner {
	@Autowired
	private WishMessageGenerator wishMessageGenerator;

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Welcome to Spring Core");
		String s=wishMessageGenerator.showWishMessage("Rama");
		System.out.println(s);
	}
}
