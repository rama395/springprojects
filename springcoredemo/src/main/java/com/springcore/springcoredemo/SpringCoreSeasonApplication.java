package com.springcore.springcoredemo;

import com.springcore.springcoredemo.springbeans.SeasonFinder;
import com.springcore.springcoredemo.springbeans.WishMessageGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreSeasonApplication implements CommandLineRunner {
	@Autowired
	private SeasonFinder seasonFinder;

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreSeasonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Welcome to Spring Core");
		String s=seasonFinder.seasonFinder();
		System.out.println(s);
	}
}
