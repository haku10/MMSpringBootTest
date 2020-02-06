package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebApiController {

	@RequestMapping("/")
	public String index(Model model) {
		return "login";
	}
}