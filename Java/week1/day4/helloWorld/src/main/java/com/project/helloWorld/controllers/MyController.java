package com.project.helloWorld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController{
	@RequestMapping("/")
	public String index(){
		return "index";
	}
}