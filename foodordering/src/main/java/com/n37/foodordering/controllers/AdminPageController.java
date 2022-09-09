package com.n37.foodordering.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminPageController {
	
	@GetMapping("/admin")
	public String adminPage () {
		return "admin";
	}
	
	@GetMapping("/restaurant")
	public String restaurantPage () {
		return "admin";
	}
	@GetMapping("/restaurant-manager")
	public String restaurantManagerPage() {
		return "restaurant";
	}
	@GetMapping("/user-manager")
	public String userManagerPage() {
		return "user";
	}
	@GetMapping("/test")
	public String testPage() {
		return "test";
	}
}
