package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Infection;
import com.example.demo.service.InfectionService;



@Controller
public class IndexController {

	@Autowired
	InfectionService infectionservice;

	@RequestMapping("/index")
	public String index(Model model) {
		List<Infection> infectionlist = infectionservice.findAllinfectionData();
		model.addAttribute("test", infectionlist.size());
		return "index";
	}


}
