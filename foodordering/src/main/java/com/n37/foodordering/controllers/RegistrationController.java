package com.n37.foodordering.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.n37.foodordering.mapper.UserMapper;
import com.n37.foodordering.model.User;
import com.n37.foodordering.model.UserExample;

@Controller

public class RegistrationController {
	
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping("/user_register")
	public String registrationForm() {
		return "registration";
	}
	
	@GetMapping("/forgotpass")
	public String Forgot() {
		return "forgot_pass";
	}
	
	@PostMapping("/register")
	public ModelAndView registerUser(@ModelAttribute User user) {
		
		String encoderPass = passwordEncoder.encode(user.getUserPassword());
		user.setUserPassword(encoderPass);
		
		user.setUserRole("USER");
		user.setIsActive(true);
		userMapper.insert(user);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		modelAndView.addObject("user", user);
		return modelAndView;
	}

}
