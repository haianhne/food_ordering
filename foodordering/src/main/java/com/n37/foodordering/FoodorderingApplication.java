package com.n37.foodordering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class FoodorderingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodorderingApplication.class, args);
	}

}
