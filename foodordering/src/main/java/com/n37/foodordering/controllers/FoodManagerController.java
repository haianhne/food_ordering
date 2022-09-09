package com.n37.foodordering.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodManagerController {
	@GetMapping("food-manager")
	public String foodManagerPage () {
		return "food_manager";
	}
}
