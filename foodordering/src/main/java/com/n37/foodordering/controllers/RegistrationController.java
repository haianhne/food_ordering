package com.n37.foodordering.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

	@GetMapping("/registration")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("registration");
		return modelAndView;
		
	}
}
