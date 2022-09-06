package com.n37.foodordering.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
	@RequestMapping("/cart") 
	public String cartPage() {
		return "cart";
	} 
}
