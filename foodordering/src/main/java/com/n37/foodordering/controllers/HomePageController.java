package com.n37.foodordering.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.n37.foodordering.mapper.UserMapper;
import com.n37.foodordering.model.User;
import com.n37.foodordering.model.UserExample;

@Controller
public class HomePageController {
	
	@Autowired
	UserMapper userMapper;
	
	@GetMapping("/")
	public ModelAndView basePage() {
		ModelAndView modelAndView = new ModelAndView("index");
		
		return modelAndView;
		
	}
	
	@GetMapping("/login")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("login");
		
//		UserExample example= new UserExample();
//		
//		example.createCriteria().andIdEqualTo((long) 1);
//
//		
//		List<User> listUsers = userMapper.selectByExample(example);
//		
//		for(User value: listUsers) {
//			System.out.println("Kiem Tra " + value.getFullName());
//		}
		
		return modelAndView;
		
	}
	
	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("home");
		
		return modelAndView;
		
	}
	
	@GetMapping("/admin")
	public ModelAndView admin() {
		ModelAndView modelAndView = new ModelAndView("admin");
		
		return modelAndView;
		
	}
	
	
}
