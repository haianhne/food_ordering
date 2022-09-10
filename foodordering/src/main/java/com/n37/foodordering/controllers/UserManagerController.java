package com.n37.foodordering.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.n37.foodordering.mapper.UserMapper;
import com.n37.foodordering.model.User;
import com.n37.foodordering.model.UserExample;

@Controller
public class UserManagerController {
	@Autowired
	UserMapper userMapper;
	@GetMapping("user-manager")
	public ModelAndView getUser (Model model) {
		ModelAndView modelAndView = new ModelAndView("user");
		UserExample example = new UserExample();
		example.createCriteria().andUserRoleEqualTo("USER");
		List<User> listUsers = userMapper.selectByExample(example);
		model.addAttribute("listUsers", listUsers);	
		return modelAndView;
	}
}
