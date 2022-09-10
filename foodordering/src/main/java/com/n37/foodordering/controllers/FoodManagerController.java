package com.n37.foodordering.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.n37.foodordering.mapper.FoodMapper;
import com.n37.foodordering.model.Food;
import com.n37.foodordering.model.FoodExample;

@Controller
public class FoodManagerController {
	@Autowired
	FoodMapper foodMapper;
	
	@GetMapping("food-manager")
	public ModelAndView getFood (Model model) {
		ModelAndView modelAndView = new ModelAndView("food_manager");
		FoodExample example = new FoodExample();
		List<Food> listFoods = foodMapper.selectByExample(example);
		model.addAttribute("listFoods", listFoods);	
		return modelAndView;
	}
	
	@PostMapping("addFood")
	public ModelAndView addFood(@ModelAttribute Food food) {
		
		food.setStatus((byte) 1);
		Date date= new Date();
		food.setUploadTime(date);
		food.setRestaurantId(5);
		
		foodMapper.insert(food);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/food-manager");
		return modelAndView;
	}
	
	@PostMapping("editFood")
	public ModelAndView editFood(Food food ,@RequestParam Map<String, Object> params) {
		food.setName((String) params.get("name"));
		food.setCategory((String) params.get("category"));
		food.setDecription((String) params.get("decription"));
		food.setUnitPrice((Long) params.get("unitPrice"));
		food.setStatus((Byte) params.get("status"));
		
		FoodExample foodExample = new FoodExample();
	
		
		foodMapper.updateByExample(food, foodExample);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/food-manager");
		return modelAndView;
	}
	
	
}
