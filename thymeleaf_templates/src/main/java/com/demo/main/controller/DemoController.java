package com.demo.main.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
//	fragment including

	@GetMapping("/service")
	public String servicesHandler(Model m) {
		System.out.println("sercvice handler....");
		
		
		
		return "service";
	}
}
