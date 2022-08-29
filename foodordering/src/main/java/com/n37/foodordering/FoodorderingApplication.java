package com.n37.foodordering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication()
public class FoodorderingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodorderingApplication.class, args);
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		  System.out.println(encoder.encode("1234"));
	}

}
