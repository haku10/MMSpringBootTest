package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class ApitestController {
	@RequestMapping("/apitest")
	public String index(Model model) {
		String test = "test";
		model.addAttribute("test", test);
		return "index";
	}

}
