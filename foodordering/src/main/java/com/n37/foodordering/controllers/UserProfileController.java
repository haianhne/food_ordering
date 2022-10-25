package com.n37.foodordering.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserProfileController {
	@RequestMapping("/profile")
	public String Profile() {
		return "user_profile";
	}
}
