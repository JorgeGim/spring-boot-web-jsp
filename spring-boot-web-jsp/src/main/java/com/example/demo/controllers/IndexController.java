package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@Value("${application.controller.title}")
	private String title;
	
	@RequestMapping("/index")
	public String index(Model model)
	{
		model.addAttribute("title", this.title);
		return "index";
	}

}
