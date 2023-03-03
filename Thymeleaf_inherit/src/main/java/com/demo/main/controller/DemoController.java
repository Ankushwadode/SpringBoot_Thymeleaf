package com.demo.main.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/about")
	public String aboutHandler(Model m) {
		System.out.println("about handler....");
		
		return "about";
	}
	
	@GetMapping("/contact")
	public String contentHandler(Model m) {
		System.out.println("contact handler....");
		
		return "contact";
	}
}
