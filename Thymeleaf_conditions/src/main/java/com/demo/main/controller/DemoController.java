package com.demo.main.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
//	conditional statements
	
	@GetMapping("/condition")
	public String ConditionHandler(Model m) {
		System.out.println("conditional handler");
		
		m.addAttribute("isActive",true);
		m.addAttribute("gender","F");
		
		List<Integer> list = List.of(0,1,3,4);
		m.addAttribute("list", list);
		
		return "condition";
	}
}
