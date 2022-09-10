package com.n37.foodordering.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodDetailController {
	@RequestMapping("/food-details")
	public String foodDetailPage () {
		return "food_details";
	}
}
