package com.n37.foodordering.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminPageController {
	
	@GetMapping("/admin")
	public ModelAndView admin() {
		ModelAndView modelAndView = new ModelAndView("admin");
		return modelAndView;
		
	}
}
