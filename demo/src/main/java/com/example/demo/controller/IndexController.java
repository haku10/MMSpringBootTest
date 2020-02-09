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

	@RequestMapping("/")
	public String root(Model model) {
		model.addAttribute("test", "最初の見開き");
		return "index";
	}

	@RequestMapping("/top")
	public String index(Model model) {
		List<Infection> infectionlist = infectionservice.findAllinfectionData();
		model.addAttribute("test", infectionlist.get(0).getName());
		return "top";
	}

}
