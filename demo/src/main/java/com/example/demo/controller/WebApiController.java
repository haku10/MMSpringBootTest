package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebApiController {

	@RequestMapping("/")
	private String hello() {
		return "SpringBoot!";
	}

}