package com.learn.springBootRestAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController 
{
	@GetMapping("map-register")
	public String mapRegister()
	{
		return "register";
	}

}
