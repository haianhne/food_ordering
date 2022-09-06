package com.n37.foodordering.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.n37.foodordering.mapper.UserMapper;
import com.n37.foodordering.model.User;

@Controller
public class RestaurantRegisterController {
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping("/res_register")
	public String resRegistrationForm() {
		return "res_registration";
	}
	
	@PostMapping("/res_register")
	public ModelAndView registerUser(@ModelAttribute User user) {
		
		String encoderPass = passwordEncoder.encode(user.getUserPassword());
		user.setUserPassword(encoderPass);
		
		user.setUserRole("RESTAURANT");
		user.setIsActive(false);
		userMapper.insert(user);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user_information");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
}
