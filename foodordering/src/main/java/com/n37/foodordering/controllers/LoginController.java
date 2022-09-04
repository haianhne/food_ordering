package com.n37.foodordering.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.n37.foodordering.model.User;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String getLoginForm() { 
		return "login";
	}
}
