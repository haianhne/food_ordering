package com.n37.foodordering.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.n37.foodordering.mapper.FoodMapper;
import com.n37.foodordering.model.Food;
import com.n37.foodordering.model.FoodExample;


@Controller
public class HomePageController {
	
	@Autowired
	FoodMapper foodMapper;
	
	@GetMapping("/")
	public ModelAndView indexPage (Model model) {
		ModelAndView modelAndView = new ModelAndView("index");
		FoodExample example = new FoodExample();
		List<Food> listFoods = foodMapper.selectByExample(example);
		model.addAttribute("listFoods", listFoods);	
		return modelAndView;
	}
}
