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
	
	@Autowired UserMapper userMapper;
	
	@GetMapping("/")
	public ModelAndView basePage() {
		ModelAndView modelAndView = new ModelAndView("index");
		UserExample example= new UserExample();
		List<User> listUser = userMapper.selectByExample(example);
		System.out.println("Kiem tra + " + listUser.size());
		
		return modelAndView;
		
	}
}
