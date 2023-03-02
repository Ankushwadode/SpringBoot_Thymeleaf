package com.demo.main.controller;


import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
//	fragment including

	@GetMapping("/dynamic")
	public String servicesHandler(Model m) {
		System.out.println("dynamic value handler....");
		
		m.addAttribute("date", LocalDateTime.now().toString());
		
		return "service";
	}
}
